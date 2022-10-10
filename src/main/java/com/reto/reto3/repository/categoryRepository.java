package com.reto.reto3.repository;

import com.reto.reto3.entities.category;
import com.reto.reto3.repository.crudRepository.categoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class categoryRepository {
    @Autowired
    private categoryCrudRepository categoryCrudRepository;

    public List<category> getAll(){
        return (List<category>) categoryCrudRepository.findAll();
    }
    public Optional<category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }

    public category save(category c){
        return categoryCrudRepository.save(c);
    }

    public void delete(category c){
        categoryCrudRepository.delete(c);
    }
}
