package com.dazhi100.student.web.biz.entity.request;

import lombok.Data;

/**
 * @author: huangjl
 * @date: 2022/4/25
 */
@Data
public class StudentLeaveRequest implements java.io.Serializable {

    private Long stuId;
    private String studentName;

    private Long leaveId;


}
