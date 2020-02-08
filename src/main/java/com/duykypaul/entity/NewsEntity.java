package com.duykypaul.entity;

import javax.persistence.*;
import java.awt.print.Book;

@Entity
@Table(name = "news")
public class NewsEntity extends BaseEntity{
    @Column
    private String title;

    @Column
    private String thumbnail ;

    @Column
    private String shortDescription;

    @Column
    private String content;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private CategoryEntity category;

}
