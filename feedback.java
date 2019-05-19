package com.re_boot.controllers;

import com.re_boot.domain.FeedbackDTO;
import com.re_boot.services.feedbackServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class feedback {

    @Autowired
    private feedbackServices feedbackServices;

    @GetMapping("/all")
    public List<FeedbackDTO> allFeedback()
    {
        return feedbackServices.findAllFeedback();
    }

    @PostMapping("/add")
    public String addFeedback(@RequestBody FeedbackDTO Feedbackdata)
    {
        return feedbackServices.saveFeedback(Feedbackdata);
    }
}

