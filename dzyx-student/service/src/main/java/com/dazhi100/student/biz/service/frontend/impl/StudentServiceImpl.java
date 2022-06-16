package com.dazhi100.student.biz.service.frontend.impl;

import com.dazhi100.student.test.dto.StudentDto;
import com.dazhi100.student.biz.service.frontend.StudentService;
import com.dazhi100.student.test.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: huangjl
 * @date: 2022/4/24
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public void saveStudent(StudentDto studentDto) {
        studentMapper.saveStudent(studentDto);
    }
}
