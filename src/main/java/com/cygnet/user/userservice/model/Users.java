package com.cygnet.user.userservice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long usersid;
    private String username;
    private String email;
    private String password;
    private String pincode;
    private long id;

}
