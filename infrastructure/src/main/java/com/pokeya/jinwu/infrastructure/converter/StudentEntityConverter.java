package com.pokeya.jinwu.infrastructure.converter;


import com.pokeya.jinwu.api.dto.StudentDto;
import com.pokeya.jinwu.infrastructure.model.StudentEntity;
import com.pokeya.yao.utils.BaseConverter;
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