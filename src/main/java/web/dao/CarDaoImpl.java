package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();

    public CarDaoImpl(){
        cars.add(new Car("Red", "Bobcat", 1990));
        cars.add(new Car("Blue", "Buccaneer", 1995));
        cars.add(new Car("Green", "Benson", 2000));
        cars.add(new Car("black", "Sabre", 1990));
        cars.add(new Car("White", "Uranus", 1997));
    }

    @Override
    public List<Car> getCars(int  count){
        List<Car> result = cars;
        if (count <= 5) {
            result = cars.stream().limit(count).toList();
        }
        return result;
    }

}
