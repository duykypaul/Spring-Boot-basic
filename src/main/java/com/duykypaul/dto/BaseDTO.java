package com.duykypaul.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public abstract class BaseDTO {
    @Getter
    private Long id;

    @Getter @Setter
    private String createdBy;

    @Getter @Setter
    private Date createdAt;

    @Getter @Setter
    private String modifiedBy;

    @Getter @Setter
    private Date modifiedAt;
}
