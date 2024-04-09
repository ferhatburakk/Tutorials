package designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

abstract class Package implements Car {
    private String name;
    protected Car car;
    protected double price;
    private List<Package> componentList = new ArrayList<>();

    public Package(String name, Car car, double price) {
        this.name = name;
        this.car = car;
        this.price = price;
        componentList.add(this);
    }

    @Override
    public double calculatePrice() {
        return car.calculatePrice() + price;
    }

    @Override
    public List<Package> getComponents() {
        List<Package> currentComponentList = car.getComponents();
        currentComponentList.add(this);
        return currentComponentList;
    }

    @Override
    public String toString() {
        return name;
    }

}

class Sunroof extends Package {
    public Sunroof(Car car, double price) {
        super("Sunroof", car, price);
    }

}

class RainSensor extends Package {
    public RainSensor(Car car, double price) {
        super("Yağmur Sensörü",car, price);
    }

}

class CruiseControl extends Package {
    public CruiseControl(Car car, double price) {
        super("Hız Sabitleyici", car, price);
    }
}

class TripComputer extends Package {

    public TripComputer(Car car, double price) {
        super("Yol Bilgisayarı", car, price);
    }
}