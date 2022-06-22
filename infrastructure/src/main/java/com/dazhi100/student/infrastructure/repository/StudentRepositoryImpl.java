package com.dazhi100.student.infrastructure.repository;

import com.dazhi100.student.api.dto.StudentDto;
import com.dazhi100.student.infrastructure.test.mapper.StudentMapper;
import com.dazhi100.student.service.acl.StudentRepository;
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
        studentMapper.saveStudent(var1);
    }
}
