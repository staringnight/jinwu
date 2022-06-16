package com.dazhi100.student.common.redis;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @author: huangjl
 * @date: 2022/4/15
 */
@Configuration
public class RedissonConfig {

    @Value("${spring.redisson.dataId}")
    private String dataId;

    @Autowired
    private NacosConfigManager nacosConfigManager;

    @Bean
    public RedissonClient redissonClient() throws IOException, NacosException {
        ConfigService configService = nacosConfigManager.getConfigService();
        String config = configService.getConfig(dataId, "", 3000);
        return Redisson.create(Config.fromYAML(config));
    }
}
