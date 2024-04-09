package designpatterns.decorator;

public class CarProvider {
    private Car car;
    private String brand;
    public void createBMW(boolean hasSunroof, boolean hasRainSensor, boolean hasCruiseControl, boolean hasTripComputer) {
        brand = "BMW";
        car = new BasicCar(brand, 685000.0);
        addExtras(hasSunroof, hasRainSensor, hasCruiseControl, hasTripComputer);
    }
    public void createAudi(boolean hasSunroof, boolean hasRainSensor, boolean hasCruiseControl, boolean hasTripComputer) {
        brand = "Audi";
        car = new BasicCar(brand, 720000.0);
        addExtras(hasSunroof, hasRainSensor, hasCruiseControl, hasTripComputer);
    }
    public void createMercedes(boolean hasSunroof, boolean hasRainSensor, boolean hasCruiseControl, boolean hasTripComputer) {
        brand = "Mercedes";
        car = new BasicCar(brand, 700000.0);
        addExtras(hasSunroof, hasRainSensor, hasCruiseControl, hasTripComputer);
    }
    private void addExtras(boolean hasSunroof, boolean hasRainSensor, boolean hasCruiseControl, boolean hasTripComputer) {
        if (hasSunroof) {
            car = new Sunroof(car, 12000.0);
        }
        if (hasRainSensor) {
            car = new RainSensor(car, 8000.0);
        }
        if (hasCruiseControl) {
            car = new CruiseControl(car, 18000.0);
        }
        if (hasTripComputer) {
            car = new TripComputer(car, 16000.0);
        }
    }
}