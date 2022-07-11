package com.pokeya.jinwu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * @author mac
 */
@Schema(title = "实体id请求")
public record EntityIdRequest(@Schema(title = "id") Long id) implements Serializable {
}
