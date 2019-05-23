package com.example.demo.repositories;

import com.example.demo.model.shoppingDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface shoppingrepo extends JpaRepository<shoppingDTO,Integer> {
}
