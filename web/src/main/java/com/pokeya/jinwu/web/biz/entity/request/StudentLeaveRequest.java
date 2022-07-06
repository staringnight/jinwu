package com.pokeya.jinwu.web.biz.entity.request;


import com.pokeya.yao.annotation.ErrorCode;
import com.pokeya.yao.constant.ResultCode;

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
