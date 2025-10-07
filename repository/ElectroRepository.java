package repository;

import models.ElectroCar;

import java.util.*;

public class ElectroRepository implements CarRepository<ElectroCar, Integer> {

    private Map<Integer, ElectroCar> cars = new HashMap<>();
    private static int Id = 0;

    @Override
    public ElectroCar save(ElectroCar truck) {
        if (truck == null){
            System.out.println("Ошибка, машина = NULL!");
            return null;
        }
        cars.put(Id, truck);
        System.out.println("Сохранили машину с ID: " + Id + ": " + truck.brand);
        Id++;
        return truck;
    }

    @Override
    public Optional<ElectroCar> findById(Integer id) {
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
        if (cars.get(id) != null){
            cars.remove(id);
            System.out.println("Удалили машину с ID " + id + ": " + cars.get(id).brand);
        }
        else{
            System.out.println("Такой машины не найдено");
        }
    }

    @Override
    public List SaveAll(Collection entities) {
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
        return cars.get(id) == null ? false : true;
    }
}
