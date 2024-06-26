package designpatterns.abstractfactory;

class BMWCarFactory implements AbstractFactory{
    @Override
    public Car createCar(String color, double price) {
        return new BMWCar(color, price);
    }
    @Override
    public MotorCycle createMotorCycle(String type, double price) {
        return new AudiMotorcycle(type, price);
    }
}
