package com.nafiul.cybergame.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "quizzes")
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String question;

    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctOption;      // "A", "B", "C", "D"
    private String topic;               // Phishing, SQL Injection ইত্যাদি
    private int points = 10;
    private int difficulty = 1;         // 1=easy, 2=medium, 3=hard
}