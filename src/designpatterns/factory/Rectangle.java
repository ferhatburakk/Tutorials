package designpatterns.factory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.err.println("Reactangle çizildi.");
    }
}
