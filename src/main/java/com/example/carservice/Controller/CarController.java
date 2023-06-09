package com.example.carservice.Controller;

import com.example.carservice.Services.CarService;
import com.example.carservice.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/car")

public class CarController {

    private CarService carService = new CarService();

    @PostMapping("add-car")
    public void postAddCar (@RequestBody Car car){
        carService.addCar(car);

    }

    @DeleteMapping("delete-car/{uuid}")
    public void deleteCar (@PathVariable UUID uuid){
          carService.deleteCar(uuid);
    }
    @GetMapping ("all-cars")
    public Map<UUID, Car> controllerGetCars (){
        return carService.getAllCarsService();
    }


}
