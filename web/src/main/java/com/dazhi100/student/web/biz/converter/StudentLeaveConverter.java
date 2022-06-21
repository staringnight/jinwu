package com.dazhi100.student.web.biz.converter;

import com.dazhi100.common.utils.BaseConverter;
import com.dazhi100.student.service.dto.StudentLeaveDto;
import com.dazhi100.student.web.biz.entity.request.StudentLeaveRequest;
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