package com.example.demo.repositories;

import com.example.demo.model.stockDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface stockrepo extends JpaRepository<stockDTO,Integer> {
}
