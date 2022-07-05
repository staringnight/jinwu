package com.dazhi100.student.web.biz.entity.request;

import com.dazhi100.common.annotation.ErrorCode;
import com.dazhi100.common.constant.ResultCode;

import javax.validation.constraints.NotNull;

/**
 * @author: huangjl
 * @date: 2022/4/25
 */
public record StudentLeaveRequest(@ErrorCode(value = ResultCode.COMMON_PARAMS_ERROR, msg = "参数错误") @NotNull Long stuId,
                                  String studentName,
                                  @NotNull
                                  Long leaveId){


}
