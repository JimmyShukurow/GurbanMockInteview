package com.example.GurbanMockInteview.controller;

import com.example.GurbanMockInteview.dto.DogUpdateDTO;
import com.example.GurbanMockInteview.service.Animal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dog")
public class DogController {

    private final Animal dogService;

    public DogController(Animal dogService) {
        this.dogService = dogService;
    }

    @GetMapping
    public ResponseEntity<?> sayHello(){
        return ResponseEntity.ok(dogService.getDogs());
    }

    @PostMapping
    public ResponseEntity<?> addDog() {
        dogService.addDog();
        return ResponseEntity.ok("Dog added successfully");
    }
    @PutMapping("{id}")
    public ResponseEntity<?> updateDog(@PathVariable Long id, @RequestBody DogUpdateDTO dog) {
        dogService.updateDog(id,dog);
        return ResponseEntity.ok("Dog updated successfully");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteDog(@PathVariable Long id) {
        dogService.delete(id);
        return ResponseEntity.ok("Dog deleted successfully");
    }
}
