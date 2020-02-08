package com.duykypaul.entity;

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
    private String name;

    @Column
    private String  code;

    @ManyToMany(mappedBy = "roles")
    private List<UserEntity> users = new ArrayList<>();
}
