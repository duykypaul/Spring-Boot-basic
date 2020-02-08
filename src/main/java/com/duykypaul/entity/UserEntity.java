package com.duykypaul.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{
    @Column
    private String userName;

    @Column
    private String password ;

    @Column
    private String fullName;

    @Column
    private String status;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<RoleEntity> roles = new ArrayList<>();
}
