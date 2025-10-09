package src.models;

public class ElectroCar extends Car{
    int batteryCapacity;
    public ElectroCar(int year, int horsePower, String brand,int batteryCapacity,boolean move) {
        super(year, horsePower, brand, move);
        this.batteryCapacity = batteryCapacity;
    }


    public void stop() {System.out.println(brand + " Остановка");}

    @Override
    public void drive(){
        System.out.println(brand + horsePower + "%");
    }

}

