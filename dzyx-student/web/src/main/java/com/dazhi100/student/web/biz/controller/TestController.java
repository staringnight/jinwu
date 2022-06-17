package com.dazhi100.student.web.biz.controller;

import com.dazhi100.grade.test.api.GradeService;
import com.dazhi100.grade.test.entity.request.GradeRequest;
import com.dazhi100.student.service.dto.StudentDto;
import com.dazhi100.student.web.biz.entity.request.StudentRequest;
import com.dazhi100.student.service.biz.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huangjl
 * @date: 2022/4/24
 */
@RestController
@RequestMapping("/student")
public class TestController {

    @Autowired
    private StudentService studentService;

    @DubboReference
    private GradeService gradeService;

    @PostMapping(value = "/saveStudent")
    public void saveStudent(@RequestBody StudentRequest studentRequest) {
        StudentDto studentInfo = new StudentDto();
        studentInfo.setStudentId(studentRequest.getStudentId());
        studentInfo.setStudentName(studentRequest.getStudentName());
        studentService.saveStudent(studentInfo);

        GradeRequest gradeRequest = new GradeRequest();
        gradeRequest.setGradeId(studentRequest.getGradeId());
        gradeRequest.setGradeName(studentRequest.getGradeName());
        gradeService.saveGrade(gradeRequest);
    }
}
