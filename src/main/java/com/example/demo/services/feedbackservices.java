package com.example.demo.services;

import com.example.demo.model.FeedbackDTO;

import java.util.List;

public interface feedbackservices {

    List<FeedbackDTO> findAllFeedback();

    String UpdateFeedback(FeedbackDTO feedbackdata);

    void insertFeedback(FeedbackDTO feedbackDTO);

    void deleteFeedback(String uname) throws IllegalAccessException;
}
