package com.socratescafe.server.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@RequiredArgsConstructor
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String username; 
    private String password; // we have to research about hashing 
    private String firstname;
    private String lastname;
    private String email;
    
    private boolean isDeleted; // Soft delete
}