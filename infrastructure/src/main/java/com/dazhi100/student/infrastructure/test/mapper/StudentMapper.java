package com.dazhi100.student.infrastructure.test.mapper;

import com.dazhi100.student.api.dto.StudentDto;
import org.apache.ibatis.annotations.Param;

/**
 * @author: huangjl
 * @date: 2022/4/24
 */
public interface StudentMapper {

    void saveStudent(@Param("info") StudentDto studentDto);
}
