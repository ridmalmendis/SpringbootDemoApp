package com.example.demo.repositories;

import com.example.demo.model.userDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepo extends JpaRepository<userDTO,Integer> {
}
