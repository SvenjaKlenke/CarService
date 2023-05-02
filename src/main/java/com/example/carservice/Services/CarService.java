package com.example.carservice.Services;

import com.example.carservice.Repository.CarRepository;
import com.example.carservice.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarService {

    private CarRepository carRepository = new CarRepository();

    public void addCar (Car car){
        this.carRepository.addCar(car);

    }

    public void deleteCar (UUID uuid){
        carRepository.deleteCar(uuid);
    }

    public Map<UUID, Car> getAllCarsService() {
        return carRepository.getAllCars();
    }
}
