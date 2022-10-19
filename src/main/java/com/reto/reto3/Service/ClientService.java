package com.reto.reto3.Service;

import com.reto.reto3.Entities.Client;
import com.reto.reto3.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private  ClientRepository clientRepository;

    public  List<Client> getAll(){
        return clientRepository.getAll();
    }

    public Optional<Client> getClient(int idClient){
        return clientRepository.getClient(idClient);
    }

    public Client save(Client cl){
        if(cl.getIdClient()==null){
            return clientRepository.save(cl);
        }else {
            Optional<Client> e = clientRepository.getClient(cl.getIdClient());
            if (e.isPresent()){
                return cl;
            }else {
                return clientRepository.save(cl);
            }
        }
    }
    public Client update(Client cl){
        if(cl.getIdClient()!=null){
            Optional<Client> q = clientRepository.getClient(cl.getIdClient());
            if (q.isPresent()){
                if (cl.getName()!=null){
                    q.get().setName(cl.getName());
                }
                if(cl.getAge()!=null){
                    q.get().setAge(cl.getAge());
                }
                if(cl.getPassword()!=null){
                    q.get().setPassword(cl.getPassword());
                }
                if(cl.getEmail()!=null){
                    q.get().setEmail(cl.getEmail());
                }
                clientRepository.save(q.get());
                return q.get();
            }else {
                return cl;
            }
        }else {
            return cl;
        }
    }
    public boolean delete(int idCliet){
        boolean flag=false;
        Optional<Client> p= clientRepository.getClient(idCliet);
        if(p.isPresent()){
            clientRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }
}