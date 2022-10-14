package com.reto.reto3.Repository.CrudRepository;

import com.reto.reto3.Entities.Admin;
import com.reto.reto3.Entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface AdminCrudRepository extends CrudRepository<Admin,Integer> {
}
