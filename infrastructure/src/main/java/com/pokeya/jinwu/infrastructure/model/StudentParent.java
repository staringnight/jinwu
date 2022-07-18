package com.pokeya.jinwu.infrastructure.model;

import java.time.LocalDateTime;

/**
    * 学生家长
    */
public class StudentParent {
    /**
    * 主键
    */
    private Long id;

    /**
    * 家长id
    */
    private Long parentId;

    /**
    * 学生id
    */
    private Long studentId;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}