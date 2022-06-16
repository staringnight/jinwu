package com.dazhi100.student.test.mapper;

import com.dazhi100.student.test.dto.StudentDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author: huangjl
 * @date: 2022/4/24
 */
@Repository("studentMapper")
public interface StudentMapper {

    void saveStudent(@Param("info") StudentDto studentDto);
}
