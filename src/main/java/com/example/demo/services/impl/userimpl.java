package com.example.demo.services.impl;

import com.example.demo.model.userDTO;
import com.example.demo.repositories.userrepo;
import com.example.demo.services.userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userimpl implements userservices {

   @Autowired
    private userrepo userrepo;

    @Override
    public List<userDTO> findallusers() {
        List<userDTO> allusers = userrepo.findAll();
        return allusers;
    }

    @Override
    public String saveuser(userDTO userdata) {
        userrepo.save(userdata);
        return "data saved";
    }
}
