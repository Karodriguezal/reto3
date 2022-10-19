package com.reto.reto3.Repository;

import com.reto.reto3.Entities.Score;
import com.reto.reto3.Repository.CrudRepository.ScoreCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ScoreRepository {
    @Autowired
    private ScoreCrudRepository scoreRepository;

    public List<Score> getAll(){ return (List<Score>) scoreRepository.findAll(); }
    public Optional<Score> getScore(int id){
        return scoreRepository.findById(id);
    }
    public Score save(Score s){
        return scoreRepository.save(s);
    }
    public void delete(Score s){
        scoreRepository.delete(s);
    }

}
