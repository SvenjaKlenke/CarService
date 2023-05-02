package com.example.carservice.Repository;

import com.example.carservice.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarRepository {

    private List <Car> allCars = new ArrayList<>();

    public void addCar (Car car){
        this.allCars.add(car);
    }

    public void deleteCar (UUID uuid){
        this.allCars.remove(uuid);
    }


}
