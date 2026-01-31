package com.nafiul.cybergame.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "scores")
@Data
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;            // পরে login থেকে আসবে
    private int totalScore;
    private int quizzesCompleted;
    private String lastPlayed = java.time.LocalDateTime.now().toString();
}