package com.pokeya.jinwu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

/**
 * 姓名、学号、性别
 */
@Schema(title = "学生")
public record StudentRequest(Long id, @Schema(title = "姓名") String name, @Schema(title = "性别") Integer gender,
                             @Schema(title = "学号") String studentNumber,
                             @Schema(title = "出生日期") LocalDateTime birthDate) {
}
