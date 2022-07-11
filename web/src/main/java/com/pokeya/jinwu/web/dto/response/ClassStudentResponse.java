package com.pokeya.jinwu.web.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 班级学生
 */
@Schema(title = "班级学生")
public record ClassStudentResponse(Long id, @Schema(title = "学生id") Long studentId,
                                   @Schema(title = "班级id") Long classId) {
}
