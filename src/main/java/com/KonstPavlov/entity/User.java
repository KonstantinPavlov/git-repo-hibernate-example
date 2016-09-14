package com.KonstPavlov.entity;

import java.io.Serializable;

/**
 * Created by Konstantin on 13.09.2016.
 *
 *
 */
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer userId;
    private String firstName;
    private String lastName;

    // конструктор с параметрами
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //пустой конструктор
    public User()
    {}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
