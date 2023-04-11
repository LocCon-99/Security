package com.javatechie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {
    private String created_date;
    private String created_by;
    private String last_modified_date;
    private String last_modified_by;
}
