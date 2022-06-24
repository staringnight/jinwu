package com.dazhi100.student.web.biz.entity.request;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author: huangjl
 * @date: 2022/4/25
 */
@Data
public class StudentRequest {

    private Long studentId;
    private String studentName;
    private LocalDateTime time;

    private Long gradeId;
    private String gradeName;

}
