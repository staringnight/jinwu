package com.pokeya.jinwu.web.controller;

import com.pokeya.jinwu.web.dto.request.EntityIdRequest;
import com.pokeya.jinwu.web.dto.request.StudentRequest;
import com.pokeya.jinwu.web.dto.response.StudentResponse;
import com.pokeya.yao.annotation.GetMappingWithClientCache;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mac
 */
@RestController
@RequestMapping("student")
@Tag(name = "student", description = "学生接口")
public class StudentController {

    @ResponseBody
    @Operation(summary = "通过id获取")
    @GetMappingWithClientCache("getStudentById")
    public StudentResponse getStudentById(EntityIdRequest entityIdRequest) {
        return null;
    }

    @ResponseBody
    @Operation(summary = "保存", description = "返回学生id")
    @PostMapping("saveStudent")
    public Long saveStudent(StudentRequest studentRequest) {
        return null;
    }

}
