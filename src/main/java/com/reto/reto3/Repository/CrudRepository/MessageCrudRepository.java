package com.reto.reto3.Repository.CrudRepository;

import com.reto.reto3.Entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
}
