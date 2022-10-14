package com.reto.reto3.Repository;

import com.reto.reto3.Entities.Category;
import com.reto.reto3.Entities.Message;
import com.reto.reto3.Repository.CrudRepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository MessageRepository;

    public List<Message> getAll(){
        return (List<Message>) MessageRepository.findAll();
    }
    public Optional<Message> getMessage(int id){
        return MessageRepository.findById(id);
    }
    public Message save(Message m){
        return MessageRepository.save(m);
    }
    public void delete(Message m){
        MessageRepository.delete(m);
    }
}
