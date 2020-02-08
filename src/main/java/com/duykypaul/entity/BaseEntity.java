package com.duykypaul.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String createdBy;

    @Column
    private Date createdAt;

    @Column
    private String modifiedBy;

    @Column
    private Date modifiedAt;
}
