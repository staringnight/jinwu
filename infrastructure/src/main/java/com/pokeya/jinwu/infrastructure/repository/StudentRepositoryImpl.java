package com.pokeya.jinwu.infrastructure.repository;

import com.pokeya.jinwu.api.dto.StudentDto;
import com.pokeya.jinwu.infrastructure.converter.StudentEntityConverter;
import com.pokeya.jinwu.infrastructure.model.StudentEntity;
import com.pokeya.jinwu.infrastructure.test.mapper.StudentMapper;
import com.pokeya.jinwu.service.acl.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private StudentMapper studentMapper;

    public StudentRepositoryImpl(@Autowired StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public void saveStudent(StudentDto var1) {
        var1 = new StudentDto(null, "1231");
        studentMapper.saveStudent(var1);
    }

    @Override
    public StudentDto getStudentDto(Long studentId) {
        StudentEntity studentEntity = studentMapper.getStudentEntity(studentId);
        return StudentEntityConverter.INSTANCES.sourceToTarget(studentEntity);
    }
}
