package com.re_boot.services;

import com.re_boot.domain.FeedbackDTO;

import java.util.List;

public interface feedbackServices {

    List<FeedbackDTO> findAllFeedback();

    String saveFeedback(FeedbackDTO feedbackdata);
}
