package designpatterns.factory;

public class FactoryMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.getShape("RECTANGLE");
        s1.draw();

        Shape s2 = shapeFactory.getShape("CIRCLE");
        s2.draw();

    }
}
