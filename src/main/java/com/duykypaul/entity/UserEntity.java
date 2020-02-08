package com.duykypaul.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{
    @Column
    @Getter @Setter
    private String userName;

    @Column
    @Getter @Setter
    private String password ;

    @Column
    @Getter @Setter
    private String fullName;

    @Column
    @Getter @Setter
    private String status;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    @Getter @Setter
    private List<RoleEntity> roles = new ArrayList<>();
}
