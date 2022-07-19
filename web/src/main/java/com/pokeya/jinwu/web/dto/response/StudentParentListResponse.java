package com.pokeya.jinwu.web.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(description = "学生家长Response")
public record StudentParentListResponse(
        @Schema(description = "学生家长list") List<StudentParentItem> studentParentItemList) {
    @Schema(description = "学生家长item")
    public record StudentParentItem(@Schema(description = "学生家长id") Long classParentId,
                                    @Schema(description = "手机号") String phone,
                                    @Schema(description = "name") String name) {

    }
}
