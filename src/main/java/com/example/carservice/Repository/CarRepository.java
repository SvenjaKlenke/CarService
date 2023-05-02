package com.example.carservice.Repository;

import com.example.carservice.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarRepository {

    private Map <UUID,Car> allCars = new HashMap<>();

    public void addCar (Car car){
        this.allCars.put(car.getUuid(),car);
    }

    public void deleteCar (UUID uuid){
         allCars.remove(uuid);
    }


}
