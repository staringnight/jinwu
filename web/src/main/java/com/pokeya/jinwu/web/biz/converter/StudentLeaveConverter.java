package com.pokeya.jinwu.web.biz.converter;

import com.pokeya.jinwu.service.dto.StudentLeaveDto;
import com.pokeya.jinwu.web.biz.entity.request.StudentLeaveRequest;
import com.pokeya.yao.utils.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

/**
 * @author mac
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentLeaveConverter extends BaseConverter<StudentLeaveRequest, StudentLeaveDto> {

    StudentLeaveConverter INSTANCES = Mappers.getMapper(StudentLeaveConverter.class);

}