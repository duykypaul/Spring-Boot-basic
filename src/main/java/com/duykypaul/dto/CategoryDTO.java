package com.duykypaul.dto;

import lombok.Getter;
import lombok.Setter;

public class CategoryDTO extends BaseDTO<CategoryDTO> {
    @Getter @Setter
    private String name;

    @Getter @Setter
    private String code;
}
