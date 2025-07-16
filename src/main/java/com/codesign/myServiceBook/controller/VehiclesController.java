package com.codesign.myServiceBook.controller;

import com.codesign.myServiceBook.model.Vehicles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehiclesController {
    Logger logger = LoggerFactory.getLogger(VehiclesController.class);
    private List<Vehicles> vehiclesArrayList = new ArrayList<>();

    // GET API to fetch all details
    @GetMapping("/vehicles")
    public List<Vehicles> getAllVehicles() {
        logger.info("getAllVehicles = " + vehiclesArrayList);
        return vehiclesArrayList;
    }

    // POST API to add new details
    @PostMapping("/vehicles")
    public String addDetails(@RequestBody Vehicles vehicle) {
        vehiclesArrayList.add(vehicle);
        logger.info("addVehicleDetails = " + vehicle);
        return "Data Inserted Successfully";
    }


    // DELETE API to remove an entry by ID
    @DeleteMapping("/vehicles/{id}")
    public String deleteVehicles(@PathVariable int id) {
        vehiclesArrayList.removeIf(vehicles -> vehicles.getId() == id);
        logger.info("deleteVehicles = " + id);
        return "Data Deleted Successfully";
    }
}
