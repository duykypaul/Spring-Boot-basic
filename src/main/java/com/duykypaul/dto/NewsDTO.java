package com.duykypaul.dto;

import lombok.Getter;
import lombok.Setter;

public class NewsDTO extends BaseDTO<NewsDTO>{
    @Getter @Setter
    private String title;

    @Getter @Setter
    private String content;

    @Getter @Setter
    private String thumbnail;

    @Getter @Setter
    private String shortDescription;

    @Getter @Setter
    private String categoryCode;
}
