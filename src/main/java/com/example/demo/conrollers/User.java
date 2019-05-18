package com.example.demo.conrollers;

import com.example.demo.model.userDTO;
import com.example.demo.services.userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private userservices userservices;

    @GetMapping("/all")
    public List<userDTO> alluser(){

        return userservices.findallusers();
    }
    @PostMapping("/add")
    public String adduser(@RequestBody userDTO userdata){

        return userservices.saveuser(userdata);
    }
}
