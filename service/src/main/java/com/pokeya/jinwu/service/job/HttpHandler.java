package com.pokeya.jinwu.service.job;

import com.pokeya.jinwu.service.acl.JobLogger;
import com.pokeya.yao.utils.HttpUtil;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Author chentong
 * @Date 2022/7/6 8:36 PM
 */
@Component
public class HttpHandler {

    public String request(String url) throws IOException {
        return HttpUtil.get(url);
    }
}
