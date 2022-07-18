package com.pokeya.jinwu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 班班级家长级学生
 */
@Schema(title = "班级家长request")
public record ClassParentRequest(@Schema(title = "学生id") Long studentId) {
}
