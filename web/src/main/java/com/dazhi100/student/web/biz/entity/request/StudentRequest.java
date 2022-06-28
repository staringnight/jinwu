package com.dazhi100.student.web.biz.entity.request;

import org.springframework.boot.context.properties.ConstructorBinding;

import java.time.LocalDateTime;

/**
 * @author: huangjl
 * @date: 2022/4/25
 */
@ConstructorBinding
public record StudentRequest(Long studentId, String studentName, LocalDateTime time, Long gradeId, String gradeName) {

}
