package com.example.demo.repositories;


import com.example.demo.model.FeedbackDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface feedbackrepo extends JpaRepository<FeedbackDTO,String> {
    default List<FeedbackDTO> findByFullname(String u) {
        return findByFullname(u);
    }


    // List<FeedbackDTO> findByType(FeedbackType type);
}
