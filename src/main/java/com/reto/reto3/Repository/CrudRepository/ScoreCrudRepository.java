package com.reto.reto3.Repository.CrudRepository;

import com.reto.reto3.Entities.Admin;
import com.reto.reto3.Entities.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreCrudRepository extends CrudRepository<Score,Integer> {
}
