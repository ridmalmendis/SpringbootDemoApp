package com.example.demo.services.impl;

import com.example.demo.model.shippingDTO;
import com.example.demo.repositories.shippingrepo;
import com.example.demo.services.shippingservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class shippingimpl implements shippingservices
{
    @Autowired
    private shippingrepo shippingrepo;

    @Override
    public List<shippingDTO> findallshippings() {
        List<shippingDTO> allshippings = shippingrepo.findAll();
        return allshippings;
    }

    @Override
    public String saveshipping(shippingDTO shippingdata) {
        shippingrepo.save(shippingdata);
        return "data saved";
    }

   /* @Override
    public String updateShipping(shippingDTO newShippingData)
    {
        String msg = null;
        if (newShippingData.getShipId() != null )
        {
            shippingrepo.save(newShippingData);
            msg = "Data updated";
        }
        else
        {
            msg = "Error";
        }

        return msg;
    }

    */
}
