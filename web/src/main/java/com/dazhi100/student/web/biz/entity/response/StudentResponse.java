package com.dazhi100.student.web.biz.entity.response;

import org.springframework.boot.context.properties.ConstructorBinding;

import java.time.LocalDateTime;

/**
 * @author: huangjl
 * @date: 2022/4/25
 */
@ConstructorBinding
public record StudentResponse(LocalDateTime time) {

}
