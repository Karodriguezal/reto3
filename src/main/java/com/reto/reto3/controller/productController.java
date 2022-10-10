package com.reto.reto3.controller;

import com.reto.reto3.entities.product;
import com.reto.reto3.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class productController {

    @Autowired
    private productService productService;

    @GetMapping("/all")
    public List<product> getAll(){
        return productService.getAll();
    }

    @PostMapping("/save")
    public product save(@RequestBody product p){
        return productService.save(p);
    }
}