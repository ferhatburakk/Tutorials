package intface;

public interface MyInterface {

    void print();

    default void defaultMethod () {
        System.err.println("default method.");
    }

    static void staticMethod() {
        System.err.println("static metohod.");
    }
}
