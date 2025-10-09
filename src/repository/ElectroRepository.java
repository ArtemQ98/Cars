package src.repository;

import src.models.ElectroCar;

import java.util.*;

public class ElectroRepository implements CarRepository<ElectroCar, Integer> {

    private List<ElectroCar> cars = new LinkedList<ElectroCar>();
    private int LastId = 0;

    @Override
    public ElectroCar save(ElectroCar car) {
        if (car == null){
            System.out.println("Ошибка, машина = NULL!");
            return null;
        }
        cars.add(car);
        System.out.println("Сохранили машину: " + car.brand);
        LastId++;
        return car;
    }

    @Override
    public Optional<ElectroCar> findById(Integer id) {
        if (id <= 0 && id > cars.size()){
            System.out.println("Неверное значение id");
            return null;
        }
        id-=1;
        if (cars.get(id) != null){
            System.out.println("Нашли машину: " + cars.get(id).brand);
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
            System.out.println("Удалили машину: " + cars.get(id).brand);
        }
        else{
            System.out.println("Такой машины не найдено");
        }
    }

    @Override
    public List<ElectroCar> SaveAll(Collection<ElectroCar> entities) {
        List<ElectroCar> carsList = List.of();
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
