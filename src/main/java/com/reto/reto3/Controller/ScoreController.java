package com.reto.reto3.Controller;

import com.reto.reto3.Entities.Message;
import com.reto.reto3.Entities.Score;
import com.reto.reto3.Service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    @Autowired
    private ScoreService ScoreService;

    @GetMapping("/all")
    public List<Score> getAll(){
        return ScoreService.getAll();
    }

    @PostMapping("/save")
    public Score save(@RequestBody Score s){
        return ScoreService.save(s);
    }
}