package com.example.demo.conrollers;

import com.example.demo.model.shippingDTO;
import com.example.demo.services.shippingservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipping")
public class Shipping
{
    @Autowired
    private shippingservices shippingservices;

    @GetMapping("/all")
    public List<shippingDTO> allshipping(){

    return shippingservices.findallshippings();
    }

    @PostMapping("/add")
    public String addshipping(@RequestBody shippingDTO shippingdata){

        return shippingservices.saveshipping(shippingdata);

    }

   /* @PutMapping("/update")
    public String updateShipping(@RequestBody shippingDTO newShippingData)
    {
        return shippingservices.updateShipping(newShippingData);
    }

    */


}
