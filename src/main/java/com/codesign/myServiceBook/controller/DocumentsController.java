package com.codesign.myServiceBook.controller;

import com.codesign.myServiceBook.model.Documents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DocumentsController {
    Logger logger = LoggerFactory.getLogger(DocumentsController.class);
    private List<Documents> documentsArrayList = new ArrayList<>();

    // GET API to fetch all details
    @GetMapping("/documents")
    public List<Documents> getAllDocuments() {
        logger.info("getAllDocuments = " + documentsArrayList);
        return documentsArrayList;
    }

    // POST API to add new details
    @PostMapping("/documents")
    public String addDetails(@RequestBody Documents vehicle) {
        documentsArrayList.add(vehicle);
        logger.info("addVehicleDetails = " + vehicle);
        return "Data Inserted Successfully";
    }


    // DELETE API to remove an entry by ID
    @DeleteMapping("/documents/{id}")
    public String deleteDocuments(@PathVariable int id) {
        documentsArrayList.removeIf(documents -> documents.getId() == id);
        logger.info("deleteDocuments = " + id);
        return "Data Deleted Successfully";
    }
}
