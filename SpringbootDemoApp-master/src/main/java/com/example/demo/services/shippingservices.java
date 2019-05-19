package com.example.demo.services;

import com.example.demo.model.shippingDTO;

import java.util.List;

public interface shippingservices
{
    List<shippingDTO> findallshippings();

    String saveshipping(shippingDTO shippingdata);

   // String updateShipping(shippingDTO newShippingData);

}
