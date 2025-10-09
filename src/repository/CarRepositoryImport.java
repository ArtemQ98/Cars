package src.repository;

import src.models.Car;

import java.util.*;

public class CarRepositoryImport implements CarRepository<Car,Integer> {
    private List<Car> cars = new LinkedList<Car>();
    private int LastId = 0;

    @Override
    public Car save(Car car) {
        if (car == null){
            System.out.println("Ошибка, машина = NULL!");
            return null;
        }
        cars.add(car);
        System.out.println("Сохранили машину с ID: " + LastId + ": " + car.brand);
        LastId++;
        return car;
    }

    @Override
    public Optional<Car> findById(Integer id) {
        if (id <= 0 && id > cars.size()){
            System.out.println("Неверное значение id");
            return null;
        }
        id-=1;
        if (cars.get(id) != null){
            System.out.println("Нашли машину ID " + id + ": " + cars.get(id).brand);
        }
        else{
            System.out.println("Такой машины не найдено");
        }
        return Optional.ofNullable(cars.get(id));
    }

    @Override
    public void deleteByID(Integer id) {
        if (id <= 0 && id > cars.size()){
            System.out.println("Неверное значение id");
            return;
        }
        id-=1;
        if (cars.get(id) != null){
            cars.remove(id);
            System.out.println("Удалили машину с ID " + (id+1) + ": " + cars.get(id).brand);
        }
        else{
            System.out.println("Такой машины не найдено");
        }
    }

    @Override
    public List<Car> SaveAll(Collection<Car> entities) {
        List<Car> carsList = List.of();
        for (int i = 0; i < cars.size(); i++) {
            carsList.add(cars.get(i));
        }
        return carsList;
    }

    @Override
    public void deleteAll() {
        if (cars.size() > 0){
            cars.clear();
            System.out.println("Удалены все машины");
        }
        else{
            System.out.println("Список машин пуст");
        }
    }

    @Override
    public long count() {
        return cars.size();
    }

    @Override
    public boolean existById(Integer id) {
        return cars.get(id-1) == null ? false : true;
    }

}
