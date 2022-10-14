package com.reto.reto3.Service;

import com.reto.reto3.Entities.Message;
import com.reto.reto3.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository MessageRepository;

    public List<Message> getAll(){
        return MessageRepository.getAll();
    }

    public Optional<Message> getMessage(int id){
        return MessageRepository.getMessage(id);
    }

    public Message save(Message m){
        if(m.getIdMessage()==null){
            return MessageRepository.save(m);
        }else {
            Optional<Message> e = MessageRepository.getMessage(m.getIdMessage());
            if (e.isPresent()){
                return m;
            }else {
                return MessageRepository.save(m);
            }
        }
    }
    public Message update(Message m){
        if(m.getIdMessage()!=null){
            Optional<Message> q = MessageRepository.getMessage(m.getIdMessage());
            if (q.isPresent()){
                if (m.getMessageText()!=null){
                    q.get().setMessageText(m.getMessageText());
                }
                MessageRepository.save(q.get());
                return q.get();
            }else {
                return m;
            }
        }else {
            return m;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Message> p= MessageRepository.getMessage(id);
        if(p.isPresent()){
            MessageRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }
}