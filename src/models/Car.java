package src.models;

public abstract class Car {
    int year;
    int horsePower;
    public String brand;
    boolean move;

    public Car(int year, int horsePower, String brand, boolean move) {
        this.year = year;
        this.horsePower = horsePower;
        this.brand = brand;
        this.move = move;
    }

    abstract void drive();
    abstract void stop();


    }
