package com.reto.reto3.Controller;

import com.reto.reto3.Entities.Category;
import com.reto.reto3.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {

    @Autowired
    private CategoryService CategoryService;

    @GetMapping("/all")
    public List<Category> getAll(){
        return CategoryService.getAll();
    }

    @PostMapping("/save")
    public Category save(@RequestBody Category c){
        return CategoryService.save(c);
    }
}