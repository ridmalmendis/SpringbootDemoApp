package com.example.demo.model;


//import com.example.demo.conrollers.enums.FeedbackType;

import javax.persistence.*;

@Entity
@Table(name = "feedbacktb")
public class FeedbackDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Feedback_id")
    private String Id;
    @Column(name = "Full_name")
    private String FullName;
    @Column(name = "email")
    private String Email;
   // @Column(name = "feedback_type")
    //private FeedbackType type;
    @Column(name = "Description")
    private String Description;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

   // public FeedbackType getType() {
   //     return type;
   // }

   // public void setType(FeedbackType type) {
   //     this.type = type;
 //   }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
