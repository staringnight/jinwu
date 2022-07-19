package com.pokeya.jinwu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * @author mac
 */
@Schema(description = "实体id请求")
public record EntityIdRequest(@Schema(description = "id") Long id) implements Serializable {
}
