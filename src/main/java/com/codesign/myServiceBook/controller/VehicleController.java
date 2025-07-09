package com.codesign.myServiceBook.controller;

import com.codesign.myServiceBook.model.Vehicles;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehicleController {
    private List<Vehicles> vehiclesArrayList = new ArrayList<>();

    // GET API to fetch all details
    @GetMapping("/vehicles")
    public List<Vehicles> getAllUsers() {
        return vehiclesArrayList;
    }

    // POST API to add new details
    @PostMapping("/vehicles")
    public String addDetails(@RequestBody Vehicles vehicle) {
        vehiclesArrayList.add(vehicle);
        return "Data Inserted Successfully";
    }


    // DELETE API to remove an entry by ID
    @DeleteMapping("/vehicles/{id}")
    public String deleteVehicles(@PathVariable int id) {
        vehiclesArrayList.removeIf(vehicles -> vehicles.getId() == id);
        return "Data Deleted Successfully";
    }
}
