package com.example.app;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/UserDoacao")
public class UserController {
    
     @Autowired
    private UserRepo UserRepo;
    @GetMapping
    public Iterable<UserDoacao> getAllDonations() {
        return UserRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UserDoacao> getDonationById(@PathVariable long id) {
        return UserRepo.findById(id);
    }

    @PostMapping
    public UserDoacao addDonation(@RequestBody UserDoacao newDonation) {
        return UserRepo.save(newDonation);
    }
}
