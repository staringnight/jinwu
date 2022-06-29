package com.dazhi100.student.infrastructure.test.mapper;

import com.dazhi100.student.api.dto.StudentDto;
import com.dazhi100.student.infrastructure.model.StudentEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @author: huangjl
 * @date: 2022/4/24
 */
public interface StudentMapper {

    void saveStudent(@Param("info") StudentDto studentDto);
    StudentEntity getStudentEntity(@Param("studentId") Long studentId);
}
