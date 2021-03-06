package pl.tom.springangulardemo.Car;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class CarController {

    private CarRepository repository;

    public CarController(CarRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/my-cars")
    @CrossOrigin(origins = "http://localhost:4200")
    Collection<Car> list(){
        return repository.findAll();
    }
}
