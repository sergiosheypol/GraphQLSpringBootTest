package com.shpl.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vehicle {
    private int id;
    private String type;
    private String modelCode;
}
