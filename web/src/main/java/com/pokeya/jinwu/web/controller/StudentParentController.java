package com.pokeya.jinwu.web.controller;

import com.pokeya.jinwu.web.dto.request.ClassParentRequest;
import com.pokeya.jinwu.web.dto.request.EntityIdRequest;
import com.pokeya.jinwu.web.dto.response.StudentParentListResponse;
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
@RequestMapping("studentParent")
@Tag(name = "studentParent", description = "学生家长")
public class StudentParentController {

    @ResponseBody
    @Operation(summary = "获取学生家长")
    @PostMapping("getStudentParentList")
    public StudentParentListResponse getStudentParent(ClassParentRequest classParentRequest) {
        return null;
    }

    @ResponseBody
    @Operation(summary = "解绑学生家长 传入学生家长id")
    @PostMapping("deleteStudentParent")
    public void deleteStudentParent(EntityIdRequest entityIdRequest) {

    }


}
