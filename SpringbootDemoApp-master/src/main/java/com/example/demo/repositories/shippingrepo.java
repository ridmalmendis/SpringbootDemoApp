package com.example.demo.repositories;

import com.example.demo.model.shippingDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface shippingrepo extends JpaRepository<shippingDTO,Integer>
{
}
