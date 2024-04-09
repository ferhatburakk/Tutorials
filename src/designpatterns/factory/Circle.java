package designpatterns.factory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.err.println("Circle çizildi");
    }
}
