package com.example.rbservice;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by magemello on 14/06/2017.
 */
@Entity
public class Robot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(max = 10)
    private String type;

    @NotNull
    private String model;

    @Size(min = 5)
    private String password;

    public Robot() {
    }

    public Robot(String type, String model, String password) {
        this.type = type;
        this.model = model;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Long getId() {
        return id;
    }
}