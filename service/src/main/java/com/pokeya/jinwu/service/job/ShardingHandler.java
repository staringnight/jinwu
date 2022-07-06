package com.pokeya.jinwu.service.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author chentong
 * @Date 2022/7/6 7:59 PM
 */
@Slf4j
@Component
public class ShardingHandler {
    public void handle() {
        for (int i = 0; i < 5; i++) {
            log.info("beat at:" + i);
        }
    }
}
