package com.example.GurbanMockInteview.service;

import com.example.GurbanMockInteview.datasource.DogEntity;
import com.example.GurbanMockInteview.dto.DogUpdateDTO;

import java.util.List;

public interface Animal {
    String makeSomeNoise();
    String sayHello();
    void addDog();
    List<DogEntity> getDogs();
    void updateDog(Long id, DogUpdateDTO dog);
    void delete(Long id);
}
