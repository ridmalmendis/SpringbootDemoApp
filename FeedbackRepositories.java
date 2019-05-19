package com.re_boot.repocitories;

import com.re_boot.domain.FeedbackDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepositories extends JpaRepository<FeedbackDTO,String> {

    //getAllFeedback
    //delete
    //update
    //custom query

}
