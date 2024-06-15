package com.electronicStore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="USER_ID")
    private int userId;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "USER_AGE")
    private int age;
    @Column(name = "USER_EMAIL")
    private String email;
    @Column(name = "USER_PASSWORD")
    private String password;
    @Column(name = "USER_ABOUT")
    private String about;


}
