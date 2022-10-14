package com.reto.reto3.Repository;

import com.reto.reto3.Entities.Category;
import com.reto.reto3.Repository.CrudRepository.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {
    @Autowired
    private static CategoryCrudRepository CategoryRepository;

    public List<Category> getAll(){
        return (List<Category>) CategoryRepository.findAll();
    }
    public static Optional<Category> getCategory(int id){
        return CategoryRepository.findById(id);
    }
    public static Category save(Category c){
        return CategoryRepository.save(c);
    }
    public void delete(Category c){
        CategoryRepository.delete(c);
    }
}
