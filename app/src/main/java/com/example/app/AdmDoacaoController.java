package com.example.app;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class AdmDoacaoController {
    @Autowired
    private AdmDoacaoController admDoacaoRepo;

    public AdmDoacaoController(){}

    @GetMapping("/api/admDoacao")
    public Iterable<AdmDoacao> consultarTodasDoacoes(){
        return admDoacaoRepo.findAll();
    }
    @GetMapping("/api/admDoacao/{id}")
    public Optional<AdmDoacao> consultarDoacao(@PathVariable long id){
        return admDoacaoRepo.findById(id);
    }
    @PostMapping("/api/admDoacao")
    public AdmDoacao adicionar(@RequestBody AdmDoacao novaDoacao){
        return admDoacaoRepo.save(novaDoacao);
    }
    
    

    
    
}
