package repository;

import models.Car;
import models.CarBrand;

import java.util.Collection;
import java.util.List;

public interface CarRepository<T, ID> {
    void addCar(Car car);
    void delCar(int ind);
    void getCar(String brand);
    void getCars(CarBrand brands);
    T Save(T entry);
    List<T> SaveAll(Collection<T> entities);
}