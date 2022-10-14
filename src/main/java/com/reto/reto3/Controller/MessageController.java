package com.reto.reto3.Controller;

import com.reto.reto3.Entities.Admin;
import com.reto.reto3.Entities.Message;
import com.reto.reto3.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    private MessageService MessageService;

    @GetMapping("/all")
    public List<Message> getAll(){
        return MessageService.getAll();
    }

    @PostMapping("/save")
    public Message save(@RequestBody Message m){
        return MessageService.save(m);
    }
}