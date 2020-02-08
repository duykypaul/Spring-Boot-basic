package com.duykypaul.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity{
    @Column
    private String name;

    @Column
    private String code;

    @OneToMany(mappedBy = "category")
    private List<NewsEntity> newsEntities = new ArrayList<>();
}
