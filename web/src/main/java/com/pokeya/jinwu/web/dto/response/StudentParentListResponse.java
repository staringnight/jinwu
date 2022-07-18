package com.pokeya.jinwu.web.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(title = "学生家长")
public record StudentParentListResponse(@Schema(title = "学生家长list") List<StudentParentItem> studentParentItemList) {
    public record StudentParentItem(@Schema(title = "学生家长id") Long classParentId, @Schema(title = "手机号") String phone,
                                    @Schema(title = "name") String name) {

    }
}
