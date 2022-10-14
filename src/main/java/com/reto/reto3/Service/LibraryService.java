package com.reto.reto3.Service;

import com.reto.reto3.Entities.Library;
import com.reto.reto3.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    public List<Library> getAll(){
        return libraryRepository.getAll();
    }

    public Optional<Library> getLibrary(int id){
        return libraryRepository.getLibrary(id);
    }

    public Library save(Library l){
        if(l.getId()==null){
            return libraryRepository.save(l);
        }else {
            Optional<Library> e = libraryRepository.getLibrary(l.getId());
            if (e.isPresent()){
                return l;
            }else {
                return libraryRepository.save(l);
            }
        }
    }
    public Library update(Library l){
        if(l.getId()!=null){
            Optional<Library> q = libraryRepository.getLibrary(l.getId());
            if (q.isPresent()){
                if (l.getName()!=null){
                    q.get().setName(l.getName());
                }
                if(l.getTarget()!=null){
                    q.get().setTarget(l.getTarget());
                }
                if(l.getDescription()!=null){
                    q.get().setDescription(l.getDescription());
                }
                if(l.getCategory()!=null){
                    q.get().setCategory(l.getCategory());
                }
                libraryRepository.save(q.get());
                return q.get();
            }else {
                return l;
            }
        }else {
            return l;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Library> p= libraryRepository.getLibrary(id);
        if(p.isPresent()){
            libraryRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }
}