package com.pokeya.jinwu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 班班级家长级学生
 */
@Schema(description = "班级家长request")
public record ClassParentRequest(@Schema(description = "学生id") Long studentId) {
}
