package com.socratescafe.server.saved;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@RequiredArgsConstructor
public class Saved {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private long userId; //fk
    private long articleId; //fk

    private boolean isDeleted; // Soft delete
}
