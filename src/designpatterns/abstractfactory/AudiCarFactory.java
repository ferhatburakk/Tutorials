package designpatterns.abstractfactory;

class AudiCarFactory implements AbstractFactory{

    @Override
    public Car createCar(String color, double price) {
        return new AudiCar(color, price);
    }

    @Override
    public MotorCycle createMotorCycle(String type, double price) {
        return new AudiMotorcycle(type, price);
    }
}