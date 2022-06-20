package com.dazhi100.student.web.biz.entity.request;

import lombok.Data;

/**
 * @author: huangjl
 * @date: 2022/4/25
 */
@Data
public class StudentRequest {

    private Long studentId;
    private String studentName;

    private Long gradeId;
    private String gradeName;

}
