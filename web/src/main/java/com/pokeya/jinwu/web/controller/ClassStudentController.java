package com.pokeya.jinwu.web.controller;

import com.pokeya.jinwu.web.dto.request.ClassStudentRequest;
import com.pokeya.jinwu.web.dto.request.EntityIdRequest;
import com.pokeya.jinwu.web.dto.response.ClassStudentResponse;
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
@RequestMapping("classStudent")
@Tag(name = "classStudent", description = "班级学生接口")
public class ClassStudentController {

    @ResponseBody
    @Operation(summary = "通过id获取")
    @GetMappingWithClientCache("getClassStudentById")
    public ClassStudentResponse getStudentById(EntityIdRequest entityIdRequest) {
        return null;
    }

    @ResponseBody
    @Operation(summary = "保存", description = "返回班级学生id")
    @PostMapping("saveStudent")
    public Long saveStudent(ClassStudentRequest studentRequest) {
        return null;
    }

}
