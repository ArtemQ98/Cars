package models;
import interfaces.Truckable;

public class ElectroTruck extends ElectroCar implements Truckable {
    int currentCapacity;

    public ElectroTruck(int year, int horsePower, String brand, int batteryCapacity, boolean move, int Capacity) {
        super(year, horsePower, brand, batteryCapacity, move);
      this.currentCapacity=Capacity;
    }
    public void load(){
        System.out.println("Загружаем электогрузовик " + brand+ ", базовая вместимость: " +Capacity + ", Текущая: " + currentCapacity + ", максимальная: " + maxCapacity);
    }
}