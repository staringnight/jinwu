package com.dazhi100.student.web.biz.controller;

import com.dazhi100.common.annotation.GetMappingWithClientCache;
import com.dazhi100.common.clientcache.query.ClientCacheQueryMatcher;
import com.dazhi100.common.utils.JSON;
import com.dazhi100.student.api.dto.StudentDto;
import com.dazhi100.student.service.biz.StudentService;
import com.dazhi100.student.web.biz.converter.StudentLeaveConverter;
import com.dazhi100.student.web.biz.entity.request.StudentLeaveRequest;
import com.dazhi100.student.web.biz.entity.request.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author mac
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private ClientCacheQueryMatcher clientCacheConfig;

    @Autowired
    public TestController(ClientCacheQueryMatcher clientCacheConfig) {
        this.clientCacheConfig = clientCacheConfig;
    }

    @GetMappingWithClientCache("/index")
    public String index() {
        return JSON.toJSONString(clientCacheConfig.getKeyConfigs());
    }

    @GetMappingWithClientCache("/get")
    public String get(@RequestParam Long stuId) {
        return studentService.get(stuId);
    }

    @PostMapping("/update")
    public String update() {
        return studentService.update(1L, 1L);
    }


    @PostMapping("/updates")
    public String update(@Validated @RequestBody StudentLeaveRequest request) {
        return studentService.update(StudentLeaveConverter.INSTANCES.sourceToTarget(request));
    }

    @Autowired
    private StudentService studentService;



    @PostMapping(value = "/saveStudent")
    public void saveStudent(@RequestBody StudentRequest studentRequest) {
        StudentDto studentInfo = new StudentDto();
        studentInfo.setStudentId(studentRequest.getStudentId());
        studentInfo.setStudentName(studentRequest.getStudentName());
        studentService.saveStudent(studentInfo);

    }
}
