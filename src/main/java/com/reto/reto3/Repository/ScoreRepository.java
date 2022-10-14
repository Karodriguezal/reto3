package com.reto.reto3.Repository;

import com.reto.reto3.Entities.Admin;
import com.reto.reto3.Entities.Score;
import com.reto.reto3.Repository.CrudRepository.AdminCrudRepository;
import com.reto.reto3.Repository.CrudRepository.ScoreCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ScoreRepository {
    @Autowired
    private static ScoreCrudRepository ScoreRepository;

    public List<Score> getAll(){ return (List<Score>) ScoreRepository.findAll(); }
    public static Optional<Score> getScore(int id){
        return ScoreRepository.findById(id);
    }
    public static Score save(Score s){
        return ScoreRepository.save(s);
    }
    public void delete(Score s){
        ScoreRepository.delete(s);
    }

}
