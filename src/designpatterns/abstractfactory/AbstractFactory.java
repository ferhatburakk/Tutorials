package designpatterns.abstractfactory;

interface AbstractFactory {
    Car createCar(String color, double price);
    MotorCycle createMotorCycle(String type, double price);
}