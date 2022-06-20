package com.dazhi100.student.infrastructure.repository;

import com.dazhi100.student.infrastructure.test.mapper.StudentMapper;
import com.dazhi100.student.service.acl.TestRepository;
import com.dazhi100.student.api.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryImpl implements TestRepository {

    private StudentMapper studentMapper;

    public TestRepositoryImpl(@Autowired StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public void saveStudent(StudentDto var1) {
        studentMapper.saveStudent(var1);
    }
}
