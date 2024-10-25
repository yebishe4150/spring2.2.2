package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars = Arrays.asList(
            new Car("car1","q",2020),
            new Car("car2","w",2019),
            new Car("car3","e",2018),
            new Car("car4","r",2017),
            new Car("car5","t",2016)
    );

    public List<Car> getCars(int count) {
        if(count>=cars.size()){
            return cars;
        }
        return cars.subList(0,count);
    }
}
