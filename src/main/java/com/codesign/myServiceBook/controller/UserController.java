package com.codesign.myServiceBook.controller;

import com.codesign.myServiceBook.model.Users;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private List<Users> usersArrayList = new ArrayList<>();

    // GET API to fetch all details
    @GetMapping("/users")
    public List<Users> getAllUsers() {
        return usersArrayList;
    }

    // POST API to add new details
    @PostMapping("/users")
    public String addDetails(@RequestBody Users user) {
        usersArrayList.add(user);
        return "Data Inserted Successfully";
    }


    // DELETE API to remove an entry by ID
    @DeleteMapping("/users/{id}")
    public String deleteUsers(@PathVariable int id) {
        usersArrayList.removeIf(users -> users.getId() == id);
        return "Data Deleted Successfully";
    }
}
