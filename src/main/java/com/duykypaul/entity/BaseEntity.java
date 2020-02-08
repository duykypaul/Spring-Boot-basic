package com.duykypaul.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column
    @Getter @Setter
    private String createdBy;

    @Column
    @Getter @Setter
    private Date createdAt;

    @Column
    @Getter @Setter
    private String modifiedBy;

    @Column
    @Getter @Setter
    private Date modifiedAt;
}
