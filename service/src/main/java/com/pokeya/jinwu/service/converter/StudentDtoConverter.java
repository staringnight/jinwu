package com.pokeya.jinwu.service.converter;


import com.pokeya.jinwu.api.dto.StudentDto;
import com.pokeya.jinwu.service.bo.StudentBo;
import com.pokeya.yao.utils.BaseConverter;
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