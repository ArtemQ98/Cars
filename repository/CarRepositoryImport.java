package repository;

import models.Car;
import models.CarBrand;

import java.util.Collection;
import java.util.List;

public class CarRepositoryImport implements CarRepository {
    Car[] cars = new Car[10];
    private int count = 0;



    public void addCar(Car car) {
        if(count >= cars.length){
            Car[] newcars =new Car[cars.length + 2];
            for (int i = 0; i < cars.length;i++){
                newcars[i] = cars[i];
            }
            cars = newcars;
        }
        cars[count] = car;
        count++;
        System.out.println("+ " + car.brand);
    }


    public void delCar(int ind) {
        cars[ind] = null;
        System.out.println("- машина №" + ind);
    }


    public void getCar(String brand) {
        for (int i = 0; i < count; i++) {
            if (cars[i] != null && cars[i].brand.equals(brand)) {
                System.out.println("Найдено: " + brand);
                return;
            }
        }
        System.out.println("Не найдено: " + brand);
    }
    public void getCars(CarBrand brand) {
        String targetBrand = brand.getBrandName();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (cars[i] != null) {
                String carBrand = cars[i].brand.trim();
                if (carBrand.equalsIgnoreCase(targetBrand)) {
                    System.out.println("Найдено: " + cars[i].brand);

                    found = true;
                }
            }
        }
        if (!found){
            System.out.println("Машин бренда " + targetBrand + " не найдено");
        }
    }

    @Override
    public Object Save(Object entry) {
        return null;
    }

    @Override
    public List SaveAll(Collection entities) {
        return List.of();
    }
}