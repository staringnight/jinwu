package com.pokeya.jinwu.service.acl;


import com.pokeya.jinwu.api.dto.StudentDto;

public interface StudentRepository {
    void saveStudent(StudentDto var1);
    StudentDto getStudentDto(Long studentId);
}
