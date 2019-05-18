package com.example.demo.services;


import com.example.demo.model.userDTO;

import java.util.List;

public interface userservices {

    List<userDTO> findallusers();

    String saveuser(userDTO userdata);
}
