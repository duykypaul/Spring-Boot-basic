package com.duykypaul.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class BaseDTO<U> {
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String createdBy;

    @Getter @Setter
    private Date createdAt;

    @Getter @Setter
    private String modifiedBy;

    @Getter @Setter
    private Date modifiedAt;

    @Getter @Setter
    private List<U> listResult = new ArrayList<>();
}
