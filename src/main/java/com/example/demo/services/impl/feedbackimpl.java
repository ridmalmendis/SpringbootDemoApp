package com.example.demo.services.impl;

//import com.example.demo.conrollers.enums.FeedbackType;
import com.example.demo.model.FeedbackDTO;
import com.example.demo.repositories.feedbackrepo;
import com.example.demo.services.feedbackservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class feedbackimpl implements feedbackservices {

    @Autowired
    private feedbackrepo fer;

    @Override
    public List<FeedbackDTO> findAllFeedback() {
        List<FeedbackDTO> allfeedbacks = fer.findAll();
        return allfeedbacks;
    }

    @Override
    public String UpdateFeedback(FeedbackDTO feedbackdata) {

        String msg = null;
        if (feedbackdata.getId() != null) {

            fer.save(feedbackdata);
            msg = "updated";
        } else {
            msg = "error";
        }

        return msg;
    }

    @Override
    public void insertFeedback(FeedbackDTO feedback) {
      //  if ( feedback.getFullName() == null ||feedback.getEmail() == null
      //     || feedback.getEmail().isEmpty() || feedback.getDescription() == null || feedback.getDescription().isEmpty()||feedback.getFullName().isEmpty()||feedback.getFullName() ==null
      //  )
     //   { throw new IllegalArgumentException("Feedback must have a Full Name, Email and a Description");
    //   } //else {
      //      Timestamp timestamp = new Timestamp(System.currentTimeMillis());


          // if (feedback.getType() == FeedbackType.viewer) {
         //       feedback.setId("VW" + timestamp.getTime());
         //   } else {
         //       feedback.setId("SRV" + timestamp.getTime());
          //  }


            fer.save(feedback);

        }
   //}

    @Override
   public void deleteFeedback(String FullName) throws IllegalAccessException {
        if (FullName.isEmpty()) { throw new IllegalArgumentException("Username is not provided to delete the user");
        }

       FeedbackDTO feedback = getFeedbackByFullname(FullName);
        fer.delete(feedback);
    }

    private FeedbackDTO getFeedbackByFullname(String FullName) throws IllegalAccessException {
        List<FeedbackDTO> feedbackDTOList1 = fer.findByFullname(FullName);

        if (feedbackDTOList1 == null || feedbackDTOList1.size() == 0) {
           throw new IllegalAccessException(FullName + ", Invalid Full Name");
      }
        return feedbackDTOList1.get(0);
    }
}

