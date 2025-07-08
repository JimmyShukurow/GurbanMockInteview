package com.example.GurbanMockInteview.service;

import com.example.GurbanMockInteview.datasource.DogEntity;
import com.example.GurbanMockInteview.datasource.DogRepository;
import com.example.GurbanMockInteview.dto.DogUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogService implements Animal{

    private final DogRepository dogRepository;

    public DogService(DogRepository dogRepository) {

        this.dogRepository = dogRepository;
    }


    @Override
    public String makeSomeNoise() {
        return " woof woof";
    }

    @Override
    public String sayHello() {
        return "Hello from dog service" + makeSomeNoise();
    }

    @Override
    public void addDog() {
        DogEntity newDog = new DogEntity();
        newDog.setName("Alagoz");
        newDog.setBreed("Alabay");
        dogRepository.save(newDog);
    }
    @Override
    public List<DogEntity> getDogs() {
        return dogRepository.findAll();
    }

    @Override
    public void updateDog(Long id, DogUpdateDTO dog) {
        var dogEntity = dogRepository.findById(id).get();
        dogEntity.setName(dog.getName());
        dogRepository.save(dogEntity);
    }

    @Override
    public void delete(Long id) {
        dogRepository.deleteById(id);
    }
}