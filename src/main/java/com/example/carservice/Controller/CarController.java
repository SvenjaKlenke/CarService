package com.example.carservice.Controller;

import com.example.carservice.Services.CarService;
import com.example.carservice.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/car")

public class CarController {

    private CarService carService = new CarService();

    @PostMapping("add-car")
    public void postAddCar (@RequestBody Car car){
        carService.addCar(car);

    }
    @GetMapping ("all-cars")
    public List controllerGetCars (){
        return carService.getAllCarsService();
    }





}
