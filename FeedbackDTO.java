package com.re_boot.domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "Feedback")
public class FeedbackDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Feedback_id")
    private Integer Id;
    @Column(name = "Full_name")
    private String FullName;
    @Column(name = "email")
    private String Email;
    @Column(name = "Phone_ number")
    private Integer PhoneNumber;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
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

    public Integer getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
