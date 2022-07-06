package com.pokeya.jinwu.service.acl;

/**
 * @Author chentong
 * @Date 2022/7/6 8:15 PM
 */
public interface JobLogger {
    boolean log(String appendLogPattern, Object... appendLogArguments);
    boolean log(Throwable e);
}
