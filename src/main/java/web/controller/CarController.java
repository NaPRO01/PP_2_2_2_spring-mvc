package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImpl;
import web.models.Car;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value ="/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = carService.carsCount(Car.getCars(), count);
        model.addAttribute("cars", cars);
        return "/cars";
    }

}
