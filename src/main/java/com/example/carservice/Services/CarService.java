package com.example.carservice.Services;

import com.example.carservice.Repository.CarRepository;
import com.example.carservice.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarService {

    private CarRepository carRepository = new CarRepository();

    public void addCar (Car car){
        this.carRepository.addCar(car);

    }

    public List getAllCarsService() {
        return carRepository.getAllCars();
    }
}
