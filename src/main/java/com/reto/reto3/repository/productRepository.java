package com.reto.reto3.repository;

import com.reto.reto3.entities.product;
import com.reto.reto3.repository.crudRepository.productCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class productRepository {

    @Autowired
    private productCrudRepository productCrudRepository;

    public List<product> getAll(){
        return (List<product>) productCrudRepository.findAll();
    }

    public Optional<product> getProduct(int id){
        return productCrudRepository.findById(id);
    }

    public product save(product p){
        return productCrudRepository.save(p);
    }
    public void delete(product p){
        productCrudRepository.delete(p);
    }
}
