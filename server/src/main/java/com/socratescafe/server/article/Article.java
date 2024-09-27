package com.socratescafe.server.article;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@RequiredArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    
    private String title; 
    private String author;
    private String text;
    private LocalDateTime datePublished;
    // picture 
    
    private boolean isDeleted; // Soft delete
}
