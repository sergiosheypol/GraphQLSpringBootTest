package com.shpl.graphql.service;

import com.shpl.graphql.model.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    public Vehicle getVehicle(final int id) {
        return Vehicle.builder()
                .id(id)
                .type("Car")
                .modelCode("120D Coupe")
                .build();
    }

}
