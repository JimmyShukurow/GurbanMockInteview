package com.example.GurbanMockInteview.controller;

import com.example.GurbanMockInteview.service.Animal;
import com.example.GurbanMockInteview.service.DogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dog")
public class DogController {

    private final Animal dogService;

    public DogController(Animal dogService) {
        this.dogService = dogService;
    }

    @GetMapping("hello")
    public String sayHello(){
        return dogService.sayHello();
    }
}
