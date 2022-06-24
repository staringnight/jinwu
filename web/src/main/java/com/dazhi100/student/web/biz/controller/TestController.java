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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * @author mac
 */
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

    @GetMappingWithClientCache("/index")
    public String index() {
        return JSON.toJSONString(clientCacheConfig.getKeyConfigs());
    }

    @NotWarpResponseBody
    @GetMappingWithClientCache("/get")
    public String get(@RequestParam Long stuId) {
        return studentService.get(stuId);
    }

    @PostMapping("/update")
    public StudentRequest update() {
        studentService.update(1L, 1L);
        StudentRequest studentRequest = new StudentRequest();
        studentRequest.setTime(LocalDateTime.now());
        return studentRequest;
    }


    @PostMapping("/updates")
    public String update(@Validated @RequestBody StudentLeaveRequest request) {
        return studentService.update(StudentLeaveConverter.INSTANCES.sourceToTarget(request));
    }


    @PostMapping(value = "/saveStudent")
    public void saveStudent(@RequestBody StudentRequest studentRequest) {
        StudentDto studentInfo = new StudentDto();
        studentInfo.setStudentId(studentRequest.getStudentId());
        studentInfo.setStudentName(studentRequest.getStudentName());
        String format = studentRequest.getTime().format(TimeConstant.UniformDateTimeFormatter);
        System.out.println(format);
        studentService.saveStudent(studentInfo);

    }
}
