package designpatterns.abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        AbstractFactory audiFactory = new AudiCarFactory();
        AbstractFactory bmwFactory = new BMWCarFactory();


        Car audiCar = audiFactory.createCar("Beyaz", 500000);
        Car bmwCar  = bmwFactory.createCar("Siyah", 420000);

        MotorCycle audiMotorCycle = audiFactory.createMotorCycle("Yarış Motoru", 125000);
        MotorCycle bmwMotorCycle = bmwFactory.createMotorCycle("Cadde Motoru", 24000);

    }
}
