package intface;

public class IntfaceMain {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.defaultMethod();

        MyInterface.staticMethod();

        StaticBlock staticBlock = new StaticBlock();
    }
}
