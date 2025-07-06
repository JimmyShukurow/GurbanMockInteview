package com.example.GurbanMockInteview.service;

import org.springframework.stereotype.Service;

@Service
public class DogService implements Animal{


    @Override
    public String makeSomeNoise() {
        return " woof woof";
    }

    @Override
    public String sayHello() {
        return "Hello from dog service" + makeSomeNoise();
    }
}
