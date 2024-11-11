package com.example.app;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/admDoacao")
public class AdmDoacaoController {

    @Autowired
    private AdmDoacaoRepo admDoacaoRepo;

    @GetMapping
    public Iterable<AdmDoacao> getAllDonations() {
        return admDoacaoRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AdmDoacao> getDonationById(@PathVariable long id) {
        return admDoacaoRepo.findById(id);
    }

    @PostMapping
    public AdmDoacao addDonation(@RequestBody AdmDoacao newDonation) {
        return admDoacaoRepo.save(newDonation);
    }
}
