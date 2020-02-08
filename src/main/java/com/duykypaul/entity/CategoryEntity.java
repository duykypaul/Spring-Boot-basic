package com.duykypaul.entity;

import lombok.Getter;
import lombok.Setter;

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
    @Getter @Setter
    private String name;

    @Column
    @Getter @Setter
    private String code;

    @OneToMany(mappedBy = "category")
    @Getter @Setter
    private List<NewsEntity> newsEntities = new ArrayList<>();
}
