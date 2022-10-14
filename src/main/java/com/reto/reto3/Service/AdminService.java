package com.reto.reto3.Service;

import com.reto.reto3.Entities.Admin;
import com.reto.reto3.Entities.Category;
import com.reto.reto3.Repository.AdminRepository;
import com.reto.reto3.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository AdminRepository;

    public List<Admin> getAll(){
        return AdminRepository.getAll();
    }

    public Optional<Admin> getAdmin(int id){
        return AdminRepository.getAdmin(id);
    }

    public Admin save(Admin a){
        if(a.getIdAdmin()==null){
            return AdminRepository.save(a);
        }else {
            Optional<Admin> e = AdminRepository.getAdmin(a.getIdAdmin());
            if (e.isPresent()){
                return a;
            }else {
                return AdminRepository.save(a);
            }
        }
    }
    public Admin update(Admin a){
        if(a.getIdAdmin()!=null){
            Optional<Admin> q = AdminRepository.getAdmin(a.getIdAdmin());
            if (q.isPresent()){
                if (a.getName()!=null){
                    q.get().setName(a.getName());
                }
                if(a.getEmail()!=null){
                    q.get().setEmail(a.getEmail());
                }
                if(a.getPassword()!=null){
                    q.get().setPassword(a.getPassword());
                }
                AdminRepository.save(q.get());
                return q.get();
            }else {
                return a;
            }
        }else {
            return a;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Admin> p= AdminRepository.getAdmin(id);
        if(p.isPresent()){
            AdminRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }
}