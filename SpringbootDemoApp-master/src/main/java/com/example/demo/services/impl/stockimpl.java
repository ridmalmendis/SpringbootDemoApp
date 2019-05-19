package com.example.demo.services.impl;

import com.example.demo.model.stockDTO;
import com.example.demo.repositories.stockrepo;
import com.example.demo.services.stockservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stockimpl implements stockservices {

    @Autowired
    private stockrepo stockrepo;

    @Override
    public List<stockDTO> findallstocks() {
        List<stockDTO> allstocks = stockrepo.findAll();
        return allstocks;
    }

    @Override
    public String savestock(stockDTO stockdata) {
        stockrepo.save(stockdata);
        return "data saved";
    }
}
