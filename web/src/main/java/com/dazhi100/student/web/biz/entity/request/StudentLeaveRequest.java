package com.dazhi100.student.web.biz.entity.request;

import com.dazhi100.common.annotation.ErrorCode;
import com.dazhi100.common.constant.ResultCode;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author: huangjl
 * @date: 2022/4/25
 */
@Data
public class StudentLeaveRequest implements java.io.Serializable {

    @ErrorCode(value = ResultCode.AES_ERROR, msg = "shidsda")
    @NotNull
    private Long stuId;
    private String studentName;

    private Long leaveId;


}
