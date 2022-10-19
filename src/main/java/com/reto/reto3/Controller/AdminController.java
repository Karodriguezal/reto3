package com.reto.reto3.Controller;

import com.reto.reto3.Entities.Admin;
import com.reto.reto3.Entities.Category;
import com.reto.reto3.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/all")
    public List<Admin> getAll(){
        return adminService.getAll();
    }

    @PostMapping("/save")
    public Admin save(@RequestBody Admin a){
        return adminService.save(a);
    }
}