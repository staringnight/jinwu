package com.dazhi100.student.web.biz.controller;

import com.dazhi100.common.annotation.GetMappingWithClientCache;
import com.dazhi100.common.annotation.NotWarpResponseBody;
import com.dazhi100.common.clientcache.query.ClientCacheQueryMatcher;
import com.dazhi100.common.constant.TimeConstant;
import com.dazhi100.common.utils.JSON;
import com.dazhi100.student.api.dto.StudentDto;
import com.dazhi100.student.service.biz.StudentService;
import com.dazhi100.student.web.biz.converter.StudentLeaveConverter;
import com.dazhi100.student.web.biz.entity.request.StudentLeaveRequest;
import com.dazhi100.student.web.biz.entity.request.StudentRequest;
import com.dazhi100.student.web.biz.entity.response.StudentResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * @author mac
 */
@Tag(name = "TestController", description = "测试接口")
@RestController
@RequestMapping("/test")
public class TestController {
    private ClientCacheQueryMatcher clientCacheConfig;
    private StudentService studentService;

    @Autowired
    public TestController(ClientCacheQueryMatcher clientCacheConfig, StudentService studentService) {
        this.clientCacheConfig = clientCacheConfig;
        this.studentService = studentService;
    }

    @Operation(summary = "index", description = "返回etag配置")
    @GetMappingWithClientCache("/index")
    public String index() {
        return JSON.toJSONString(clientCacheConfig.getKeyConfigs());
    }

    @NotWarpResponseBody
    @GetMappingWithClientCache("/get")
    @Operation(summary = "获取学生姓名")
    public String get(@RequestParam Long stuId) {
        return studentService.get(stuId);
    }

    @PostMapping("/update")
    @Operation(summary = "更新学生")
    public StudentResponse update() {
        studentService.update(1L, 1L);
        StudentResponse studentRequest = new StudentResponse(LocalDateTime.now());
        return studentRequest;
    }


    @PostMapping("/updates")
    @Operation(summary = "更新学生")
    public String updates(@Validated @RequestBody StudentLeaveRequest request) {
        return studentService.update(StudentLeaveConverter.INSTANCES.sourceToTarget(request));
    }


    @PostMapping(value = "/saveStudent")
    @Operation(summary = "保存学生")
    public void saveStudent(@RequestBody StudentRequest studentRequest) {
        StudentDto studentInfo = new StudentDto(studentRequest.studentId(), studentRequest.studentName());
        String format = studentRequest.time().format(TimeConstant.UniformDateTimeFormatter);
        System.out.println(format);
        studentService.saveStudent(studentInfo);

    }
}
