package com.pokeya.jinwu.infrastructure.test.mapper;

import com.pokeya.jinwu.api.dto.StudentDto;
import com.pokeya.jinwu.infrastructure.model.StudentEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @author: huangjl
 * @date: 2022/4/24
 */
public interface StudentMapper {

    void saveStudent(@Param("info") StudentDto studentDto);
    StudentEntity getStudentEntity(@Param("studentId") Long studentId);
}
