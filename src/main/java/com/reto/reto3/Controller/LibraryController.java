package com.reto.reto3.Controller;

import com.reto.reto3.Entities.Library;
import com.reto.reto3.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Lib")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/all")
    public List<Library> getAll(){
        return libraryService.getAll();
    }
    @PostMapping("/save")
    public Library save(@RequestBody Library l){
        return libraryService.save(l);
    }
}