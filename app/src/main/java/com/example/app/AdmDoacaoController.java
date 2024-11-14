package com.example.app;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
   // Método para atualizar uma doação existente
   @PutMapping("/{id}")
   public ResponseEntity<AdmDoacao> updateDonation(@PathVariable long id, @RequestBody AdmDoacao updatedDonation) {
       return admDoacaoRepo.findById(id)
               .map(existingDonation -> {
                   updatedDonation.setId(existingDonation.getId()); // Garante que o ID não seja modificado
                   AdmDoacao savedDonation = admDoacaoRepo.save(updatedDonation);
                   return ResponseEntity.ok(savedDonation);
               })
               .orElseGet(() -> ResponseEntity.notFound().build());
   }

   // Método para deletar uma doação por ID
   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deleteDonation(@PathVariable long id) {
       if (admDoacaoRepo.existsById(id)) {
           admDoacaoRepo.deleteById(id);
           return ResponseEntity.noContent().build(); // Retorna código de status 204 (No Content)
       } else {
           return ResponseEntity.notFound().build();
       }
    }
}
