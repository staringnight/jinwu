package com.pokeya.jinwu.web.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

/**
 * 姓名、学号、性别
 */
@Schema(description = "学生")
public record StudentResponse(Long id, @Schema(description = "姓名") String name, @Schema(description = "性别") Integer gender,
                              @Schema(description = "学号") String studentNumber,
                              @Schema(description = "出生日期") LocalDateTime birthDate) {
}
