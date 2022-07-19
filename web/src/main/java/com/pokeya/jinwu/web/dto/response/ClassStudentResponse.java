package com.pokeya.jinwu.web.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 班级学生
 */
@Schema(description = "班级学生")
public record ClassStudentResponse(Long id, @Schema(description = "学生id") Long studentId,
                                   @Schema(description = "班级id") Long classId) {
}
