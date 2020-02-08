package com.duykypaul.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity{
    @Column
    @Getter @Setter
    private String name;

    @Column
    @Getter @Setter
    private String  code;

    @ManyToMany(mappedBy = "roles")
    @Getter @Setter
    private List<UserEntity> users = new ArrayList<>();
}
