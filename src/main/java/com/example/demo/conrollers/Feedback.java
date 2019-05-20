package com.example.demo.conrollers;

import com.example.demo.model.FeedbackDTO;
import com.example.demo.services.feedbackservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Feedback")
public class Feedback {

    @Autowired
    private feedbackservices fe;


    @GetMapping("/all")
    public List<FeedbackDTO> allfeedbacks() {

        return fe.findAllFeedback();
    }

    @PutMapping("/update")
    public String updatefeedback(@RequestBody FeedbackDTO feedbackdata) {

        return fe.UpdateFeedback(feedbackdata);

    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ResponseEntity<String> userRegistration(@RequestBody FeedbackDTO feedback) {

        try {
            if (feedback != null) {
                fe.insertFeedback(feedback);
                return new ResponseEntity<>("New Feedback is Registered.", HttpStatus.CREATED);
            }
        } catch (IllegalArgumentException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>("Feedback Object is Empty", HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/deleteFeedback/{fullname}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteFeedback(@PathVariable String fullname) {

       try {
            if (fullname != null) {
                fe.deleteFeedback(fullname);
                return new ResponseEntity<>("Feedback is Deleted.", HttpStatus.OK);
            }
        } catch (IllegalArgumentException ex) {
           return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        } catch (IllegalAccessException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
       }
       return new ResponseEntity<>("Full name is getting Null.", HttpStatus.NO_CONTENT);
    }
}
