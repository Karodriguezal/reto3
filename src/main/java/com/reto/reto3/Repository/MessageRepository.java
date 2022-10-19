package com.reto.reto3.Repository;

import com.reto.reto3.Entities.Message;
import com.reto.reto3.Repository.CrudRepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageRepository;

    public List<Message> getAll(){
        return (List<Message>) messageRepository.findAll();
    }
    public Optional<Message> getMessage(int id){
        return messageRepository.findById(id);
    }
    public Message save(Message m){
        return messageRepository.save(m);
    }
    public void delete(Message m){
        messageRepository.delete(m);
    }
}
