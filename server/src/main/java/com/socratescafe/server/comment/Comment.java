package com.socratescafe.server.comment;

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
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private long userId; //fk
    private long articleId; //fk

    private String text; 
    private LocalDateTime dateTime;
    
    private boolean isDeleted; // Soft delete
}
