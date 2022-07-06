package com.pokeya.jinwu.web;

import com.pokeya.yao.utils.WeComPushUtil;
import com.pokeya.yao.utils.enums.WeComContentEnums;
import com.pokeya.yao.utils.enums.WeComUrlEnums;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest(classes = StudentApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WebApplicationTests {

    @Resource
    WeComPushUtil weComPushUtil;

    @Test
    void contextLoads() {
        weComPushUtil.push(WeComUrlEnums.AGILE_TEAM, WeComContentEnums.SECURITY_SCORE, "测试");
    }

}
