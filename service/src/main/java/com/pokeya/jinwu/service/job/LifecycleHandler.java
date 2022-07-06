package com.pokeya.jinwu.service.job;

import com.pokeya.jinwu.service.acl.JobLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author chentong
 * @Date 2022/7/6 8:46 PM
 */
@Component
public class LifecycleHandler {
    private JobLogger jobLogger;

    public LifecycleHandler(@Autowired JobLogger jobLogger) {
        this.jobLogger = jobLogger;
    }

    public void handler() {
        jobLogger.log("handler");
    }

    public void init() {
        jobLogger.log("init");
    }

    public void destroy() {
        jobLogger.log("destroy");
    }

}
