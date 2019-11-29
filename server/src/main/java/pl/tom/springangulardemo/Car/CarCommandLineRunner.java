package pl.tom.springangulardemo.Car;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class CarCommandLineRunner implements CommandLineRunner {

    private final CarRepository repository;

    public CarCommandLineRunner(CarRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("SUBARU", "MERCEDES", "BMW", "TOYOTA", "HONDA", "NISSAN", "SKODA").forEach(mark -> repository.save(new Car(mark)));
        repository.findAll().forEach(System.out::println);
    }
}
