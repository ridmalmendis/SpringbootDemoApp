package com.example.demo.services.imple;

import com.example.demo.model.shoppingDTO;
import com.example.demo.repositories.shoppingrepo;
import com.example.demo.services.productservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class proserimple implements productservices {


    @Autowired
    private shoppingrepo shoppingrepo;


    @Override
    public List<shoppingDTO> findallproducts() {
        List<shoppingDTO> allproducts = shoppingrepo.findAll();
        return allproducts;
    }

    @Override
    public String saveproduct(shoppingDTO shoppingdata) {
        shoppingrepo.save(shoppingdata);
        return "data saved";
    }

    @Override
    public String updateproduct(shoppingDTO newshoppingdata) {

        String msg=null;
        if(newshoppingdata.getproductid() != null){
            shoppingrepo.save(newshoppingdata);
        }
        else{
            msg = "ERROR";

        }
        return msg;
    }

    @Override
    public shoppingDTO findByproductid(Integer productid) {
        return shoppingrepo.getOne(productid);
    }
}

