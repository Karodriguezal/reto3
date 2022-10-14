package com.reto.reto3.Service;

import com.reto.reto3.Entities.Category;
import com.reto.reto3.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> getAll(){
        return CategoryRepository.getAll();
    }

    public Optional<Category> getCategory(int id){
        return CategoryRepository.getCategory(id);
    }

    public Category save(Category c){
        if(c.getId()==null){
            return CategoryRepository.save(c);
        }else {
            Optional<Category> e = CategoryRepository.getCategory(c.getId());
            if (e.isPresent()){
                return c;
            }else {
                return CategoryRepository.save(c);
            }
        }
    }
    public Category update(Category c){
        if(c.getId()!=null){
            Optional<Category> q = CategoryRepository.getCategory(c.getId());
            if (q.isPresent()){
                if (c.getName()!=null){
                    q.get().setName(c.getName());
                }
                if(c.getName()!=null){
                    q.get().setName(c.getName());
                }
                if(c.getDescription()!=null){
                    q.get().setDescription(c.getDescription());
                }
                if(c.getCategory()!=null){
                    q.get().setCategory(c.getCategory());
                }
                CategoryRepository.save(q.get());
                return q.get();
            }else {
                return c;
            }
        }else {
            return c;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Category> p= CategoryRepository.getCategory(id);
        if(p.isPresent()){
            CategoryRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }
}