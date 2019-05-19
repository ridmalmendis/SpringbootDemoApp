package com.example.demo.conrollers;

import com.example.demo.model.stockDTO;
import com.example.demo.services.stockservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class Stock {

    @Autowired
    private stockservices stockservices;

    @GetMapping("/all")
    public List<stockDTO> allstock(){

        return stockservices.findallstocks();
    }
    @PostMapping("/add")
    public String addstock(@RequestBody stockDTO stockdata){

        return stockservices.savestock(stockdata);
    }
}
