package com.dazhi100.student.service.converter;


import com.dazhi100.common.utils.BaseConverter;
import com.dazhi100.student.api.dto.StudentDto;
import com.dazhi100.student.service.bo.StudentBo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

/**
 * @author mac
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentDtoConverter extends BaseConverter<StudentDto, StudentBo> {

    StudentDtoConverter INSTANCES = Mappers.getMapper(StudentDtoConverter.class);

}