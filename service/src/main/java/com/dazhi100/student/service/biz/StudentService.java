package com.dazhi100.student.service.biz;


import com.dazhi100.student.api.dto.StudentDto;
import com.dazhi100.student.service.acl.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: huangjl
 * @date: 2022/4/24
 */
@Service
public class StudentService {

    private TestRepository testRepository;

    @Autowired
    public StudentService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public void saveStudent(StudentDto studentDto) {
        testRepository.saveStudent(studentDto);
    }
}
