package com.dazhi100.student.web.biz.entity.request;

import java.time.LocalDateTime;

/**
 * @author: huangjl
 * @date: 2022/4/25
 */
public record StudentRequest(Long studentId, String studentName, LocalDateTime time, Long gradeId, String gradeName) {

}
