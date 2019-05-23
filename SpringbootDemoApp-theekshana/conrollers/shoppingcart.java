package com.example.demo.conrollers;

import com.example.demo.model.shoppingDTO;
import com.example.demo.services.productservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shoppingcart")

public class shoppingcart {


    @Autowired
    private productservices productservices;


    @GetMapping("/all")
    public List<shoppingDTO> allproducts() {

        return productservices.findallproducts();
    }

    @PostMapping("/add")
    public String addproduct(@RequestBody shoppingDTO shoppingdata) {

        return productservices.saveproduct(shoppingdata);
    }

    @PutMapping("/update")
    public String updateproduct(@RequestBody shoppingDTO newshoppingdata) {

        return productservices.updateproduct(newshoppingdata);
    }

    @GetMapping("/find/{productid}")
    public shoppingDTO getproductByproductid(@PathVariable Integer productid) {
        return productservices.findByproductid(productid);
    }

}




