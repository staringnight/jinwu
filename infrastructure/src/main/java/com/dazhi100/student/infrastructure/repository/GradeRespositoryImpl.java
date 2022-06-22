package com.dazhi100.student.infrastructure.repository;

import com.dazhi100.student.service.acl.GradeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class GradeRespositoryImpl implements GradeRepository {

   // @DubboReference
    //private GradeService gradeService;


    @Override
    public void get() {
        //gradeService.saveGrade(null);
    }
}
