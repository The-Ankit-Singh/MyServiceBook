package com.codesign.myServiceBook.controller;

import com.codesign.myServiceBook.model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {
    Logger logger = LoggerFactory.getLogger(UsersController.class);
    private List<Users> usersArrayList = new ArrayList<>();

    // GET API to fetch all details
    @GetMapping("/users")
    public List<Users> getAllUsers() {
        logger.info("getAllUsers = " + usersArrayList);
        return usersArrayList;
    }

    // POST API to add new details
    @PostMapping("/users")
    public String addDetails(@RequestBody Users user) {
        usersArrayList.add(user);
        logger.info("addUserDetails = " + user);
        return "Data Inserted Successfully";
    }


    // DELETE API to remove an entry by ID
    @DeleteMapping("/users/{id}")
    public String deleteUsers(@PathVariable int id) {
        usersArrayList.removeIf(users -> users.getId() == id);
        logger.info("deleteUsers = " + id);
        return "Data Deleted Successfully";
    }
}
