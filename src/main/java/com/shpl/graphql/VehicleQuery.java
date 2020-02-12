package com.shpl.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.shpl.graphql.model.Vehicle;
import com.shpl.graphql.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;

    public Optional<Vehicle> getVehicle(final int id) {
        return Optional.ofNullable(this.vehicleService.getVehicle(id));
    }
}