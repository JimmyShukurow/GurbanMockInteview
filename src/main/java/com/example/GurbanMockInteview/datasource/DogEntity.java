package com.example.GurbanMockInteview.datasource;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dogs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DogEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String breed;
}
