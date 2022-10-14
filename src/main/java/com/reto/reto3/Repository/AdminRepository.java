package com.reto.reto3.Repository;

import com.reto.reto3.Entities.Admin;
import com.reto.reto3.Entities.Category;
import com.reto.reto3.Repository.CrudRepository.AdminCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdminRepository {
    @Autowired
    private static AdminCrudRepository AdminRepository;

    public List<Admin> getAll(){
        return (List<Admin>) AdminRepository.findAll();
    }
    public static Optional<Admin> getAdmin(int id){
        return AdminRepository.findById(id);
    }
    public static Admin save(Admin a){
        return AdminRepository.save(a);
    }
    public void delete(Admin a){
        AdminRepository.delete(a);
    }
}
