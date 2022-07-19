package com.pokeya.jinwu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

/**
 * 姓名、学号、性别
 */
@Schema(description = "学生")
public record StudentRequest(Long id, @Schema(description = "姓名") String name, @Schema(description = "性别  1男 0 女") Integer gender,
                             @Schema(description = "学号") String studentNumber,
                             @Schema(description = "出生日期") LocalDateTime birthDate) {
}
