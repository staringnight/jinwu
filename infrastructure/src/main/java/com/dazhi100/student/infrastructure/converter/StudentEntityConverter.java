package com.dazhi100.student.infrastructure.converter;


import com.dazhi100.common.utils.BaseConverter;
import com.dazhi100.student.api.dto.StudentDto;
import com.dazhi100.student.infrastructure.model.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

/**
 * @author mac
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentEntityConverter extends BaseConverter<StudentEntity, StudentDto> {

    StudentEntityConverter INSTANCES = Mappers.getMapper(StudentEntityConverter.class);

}