package com.example.demo.services;


import com.example.demo.model.stockDTO;

import java.util.List;

public interface stockservices {

    List<stockDTO> findallstocks();

    String savestock(stockDTO stockdata);
}
