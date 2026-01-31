package com.nafiul.cybergame.controller;

import com.nafiul.cybergame.entity.Quiz;
import com.nafiul.cybergame.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class QuizController {

    @Autowired
    private QuizRepository quizRepository;

    @GetMapping("/quizzes")
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @GetMapping("/quizzes/topic/{topic}")
    public List<Quiz> getQuizzesByTopic(@PathVariable String topic) {
        return quizRepository.findByTopic(topic);
    }
}