package com.dazhi100.student.web;

import com.dazhi100.common.utils.WeComPushUtil;
import com.dazhi100.common.utils.enums.WeComContentEnums;
import com.dazhi100.common.utils.enums.WeComUrlEnums;
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
