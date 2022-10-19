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
    private CategoryCrudRepository categoryRepository;

    public List<Category> getAll(){
        return (List<Category>) categoryRepository.findAll();
    }
    public Optional<Category> getCategory(int id){
        return categoryRepository.findById(id);
    }
    public Category save(Category c){
        return categoryRepository.save(c);
    }
    public void delete(Category c){
        categoryRepository.delete(c);
    }
}
