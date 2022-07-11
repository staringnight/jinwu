package com.pokeya.jinwu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 班级学生
 */
@Schema(title = "班级学生request")
public record ClassStudentRequest(Long id, @Schema(title = "学生id") Long studentId,
                                  @Schema(title = "班级id") Long classId) {
}
