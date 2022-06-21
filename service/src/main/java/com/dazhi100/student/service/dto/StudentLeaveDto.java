package com.dazhi100.student.service.dto;

import lombok.Data;

/**
 * @author: huangjl
 * @date: 2022/4/25
 */
@Data
public class StudentLeaveDto implements java.io.Serializable {

    private Long stuId;
    private String studentName;

    private Long leaveId;

}
