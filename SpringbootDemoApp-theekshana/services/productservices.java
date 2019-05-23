package com.example.demo.services;

import com.example.demo.model.shoppingDTO;
import com.example.demo.model.userDTO;

import java.util.List;

public interface productservices {
    List<shoppingDTO> findallproducts();

    String saveproduct(shoppingDTO shoppingdata);

    String updateproduct(shoppingDTO newshoppingdata);

    shoppingDTO findByproductid(Integer productid);
}
