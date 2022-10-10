package com.reto.reto3.service;

import com.reto.reto3.entities.product;
import com.reto.reto3.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productService {

    @Autowired
    private productRepository productRepository;

    public List<product> getAll(){
        return productRepository.getAll();
    }

    public Optional<product> getProduct(int id){
        return productRepository.getProduct(id);
    }

    public product save(product p){
        if(p.getId()==null){
            return productRepository.save(p);
        }else {
            Optional<product> e =productRepository.getProduct(p.getId());
            if (e.isPresent()){
                return p;
            }else {
                return productRepository.save(p);
            }
        }
    }
    public product update(product p){
        if(p.getId()!=null){
            Optional<product> q =productRepository.getProduct(p.getId());
            if (q.isPresent()){
                if (p.getName()!=null){
                    q.get().setName(p.getName());
                }
                if(p.getYear()!=null){
                    q.get().setYear(p.getYear());
                }
                if(p.getCategory()!=null){
                    q.get().setCategory(p.getCategory());
                }
                productRepository.save(q.get());
                return q.get();
            }else {
                return p;
            }
        }else {
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<product>p=productRepository.getProduct(id);
        if(p.isPresent()){
            productRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }
}