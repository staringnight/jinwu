package com.dazhi100.student.common.mq;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author: huangjl
 * @date: 2022/4/19
 */
@Component
@RocketMQMessageListener(topic = "test_topic", consumerGroup = "con_1")
public class MqTestConsumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String msg) {
        System.out.println("消息已消费: " + msg);
    }
}
