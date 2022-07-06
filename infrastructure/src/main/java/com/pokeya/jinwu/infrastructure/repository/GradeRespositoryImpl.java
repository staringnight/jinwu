package com.pokeya.jinwu.infrastructure.repository;

import com.pokeya.jinwu.service.acl.GradeRepository;
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
