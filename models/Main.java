package models;
import interfaces.Truckable;
import repository.CarRepositoryImport;
import repository.ElectroRepository;

public class Main {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(2020, 300, "Порше ", 5000,false);
        sedan1.drive();


        ElectroCar electro = new ElectroCar(2025, 574, "Tesla ", 5000, true);


        System.out.println("-----------------------------------------------");

        CarRepositoryImport rep = new CarRepositoryImport();
        rep.save(sedan1);
        rep.save(electro);
        System.out.println(rep.count());
        System.out.println(rep.existById(1));
        rep.deleteByID(1);

    }
}
