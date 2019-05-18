package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class userDTO {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name = "user_ID")
    private Integer id;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }





}
