package com.re_boot.services.impl;

import com.re_boot.controllers.feedback;
import com.re_boot.domain.FeedbackDTO;
import com.re_boot.repocitories.FeedbackRepositories;
import com.re_boot.services.feedbackServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class feedbackServiceimpl implements feedbackServices {

    @Autowired
    private FeedbackRepositories feedbackRepositories;

    @Override
    public List<FeedbackDTO> findAllFeedback() {
        List<FeedbackDTO> allfeedback = feedbackRepositories.findAll();
        return  allfeedback;
    }

    @Override
    public String saveFeedback(FeedbackDTO feedbackdata) {
        feedbackRepositories.save(feedbackdata);
        return "Data saved";
    }
}
