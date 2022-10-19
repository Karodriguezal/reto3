package com.reto.reto3.Repository;

import com.reto.reto3.Entities.Library;
import com.reto.reto3.Repository.CrudRepository.LibraryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LibraryRepository {
    @Autowired
    private LibraryCrudRepository libraryRepository;

    public List<Library> getAll(){
        return (List<Library>) libraryRepository.findAll();
    }
    public Optional<Library> getLibrary(int id){
        return libraryRepository.findById(id);
    }
    public Library save(Library l){
        return libraryRepository.save(l);
    }
    public void delete(Library l){ libraryRepository.delete(l);
    }
}
