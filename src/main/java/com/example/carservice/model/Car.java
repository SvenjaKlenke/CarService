package com.example.carservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {

    private String name;
    private int wheels;
    private boolean hasTÜV;
    private UUID uuid = UUID.randomUUID();
}
