package com.javatechie.entity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseEntity {
    @Column(name = "created_date")
    private Timestamp created_date;

    @Column(name = "created_by")
    private String created_by;

    @Column(name = "updated_date")
    private Timestamp updated_date;

    @Column(name = "updated_by")
    private String updated_by;
}
