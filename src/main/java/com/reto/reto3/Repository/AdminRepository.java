package com.reto.reto3.Repository;

import com.reto.reto3.Entities.Admin;
import com.reto.reto3.Repository.CrudRepository.AdminCrudRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
public class AdminRepository {

    @Autowired
    private AdminCrudRepository adminRepository;

    public List<Admin> getAll() {
        return (List<Admin>) adminRepository.findAll();
    }

    public Optional<Admin> getAdmin(int id) {
        return adminRepository.findById(id);
    }

    public Admin save(Admin a) {
        return adminRepository.save(a);
    }

    public void delete(Admin a) {
        adminRepository.delete(a);
    }
}
