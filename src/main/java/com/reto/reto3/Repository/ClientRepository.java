package com.reto.reto3.Repository;

import com.reto.reto3.Entities.Client;
import com.reto.reto3.Repository.CrudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository ClientRepository;
    public List<Client> getAll(){ return (List<Client>) ClientRepository.findAll(); }
    public Optional<Client> getClient(int id){ return ClientRepository.findById(id); }
    public Client save(Client cl){ return ClientRepository.save(cl); }
    public void delete(Client cl){ ClientRepository.delete(cl); }
}
