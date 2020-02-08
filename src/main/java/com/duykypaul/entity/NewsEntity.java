package com.duykypaul.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.awt.print.Book;

@Entity
@Table(name = "news")
public class NewsEntity extends BaseEntity{
    @Column
    @Getter @Setter
    private String title;

    @Column
    @Getter @Setter
    private String thumbnail ;

    @Column
    @Getter @Setter
    private String shortDescription;

    @Column
    @Getter @Setter
    private String content;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    @Getter @Setter
    private CategoryEntity category;

}
