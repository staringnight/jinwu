package com.pokeya.jinwu.infrastructure.mapper;

import com.pokeya.jinwu.infrastructure.model.StudentParent;

public interface StudentParentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StudentParent record);

    int insertSelective(StudentParent record);

    StudentParent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StudentParent record);

    int updateByPrimaryKey(StudentParent record);
}