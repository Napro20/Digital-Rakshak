package com.nafiul.cybergame.controller;

import com.nafiul.cybergame.entity.Score;
import com.nafiul.cybergame.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class ScoreController {

    @Autowired
    private ScoreRepository scoreRepository;

    @PostMapping("/scores")
    public Score saveScore(@RequestBody Score score) {
        return scoreRepository.save(score);
    }

    @GetMapping("/leaderboard")
    public List<Score> getLeaderboard() {
        return scoreRepository.findTop10ByOrderByTotalScoreDesc();
    }
}