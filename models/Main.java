package models;
import interfaces.Truckable;
import repository.CarRepositoryImport;

public class Main {
    public static void main(String[] args) {
        Sedan sedan_0 = new Sedan(2020, 300, "Порше ", 5000,false);
        sedan_0.drive();

        Truck truck = new Truck(2020, 300, "Volvo ", 5000, false);
        truck.drive();
        truck.stop();

        ElectroCar electro = new ElectroCar(2020, 300, "Tesla ", 5000, true);
        electro.stop();
        electro.drive();

        Truckable TruckInterface = new Truck(2020, 300, "Volvo ", 450, false);
        TruckInterface.load();

        Truckable electroTruckInterface = new ElectroTruck(2021, 400, "TeslaСybertruck ", 300, true, 100);
        electroTruckInterface.load();

        System.out.println("-----------------------------------------------");

        CarRepositoryImport rep = new CarRepositoryImport();
        rep.save(sedan_0);
        System.out.println(rep.count());
        
    }
}
