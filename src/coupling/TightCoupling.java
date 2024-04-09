package coupling;

public class TightCoupling {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Programmer programmer = new Programmer();
        programmer.code(laptop);
    }
}
