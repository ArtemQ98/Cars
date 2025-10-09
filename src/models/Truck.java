package src.models;
import src.interfaces.Truckable;

public class Truck extends Car implements Truckable{
    int currentCapacity;


    public Truck(int year, int horsePower, String brand, int loadCapacity, boolean move ) {
        super(year, horsePower, brand, move);
        this.currentCapacity = loadCapacity;
    }

    @Override
    public void drive(){
        System.out.println(brand  +  "Перевернулась" );
     }

    public void stop() {System.out.println(brand + " Остановка");}

    public void load(){
        System.out.println("Загружаем грузовик " + brand+ ", базовая вместимость: " +Capacity + ", Текущая: " + currentCapacity + ", максимальная: " + maxCapacity);
    }
}
