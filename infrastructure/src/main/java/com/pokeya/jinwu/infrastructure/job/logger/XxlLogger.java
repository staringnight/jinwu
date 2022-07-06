package com.pokeya.jinwu.infrastructure.job.logger;

import com.pokeya.jinwu.service.acl.JobLogger;
import com.xxl.job.core.context.XxlJobHelper;
import org.springframework.stereotype.Component;

/**
 * @Author chentong
 * @Date 2022/7/6 8:16 PM
 */
@Component
public class XxlLogger implements JobLogger {
    @Override
    public boolean log(String appendLogPattern, Object... appendLogArguments) {
        return XxlJobHelper.log(appendLogPattern, appendLogArguments);
    }

    @Override
    public boolean log(Throwable e) {
        return XxlJobHelper.log(e);
    }
}
