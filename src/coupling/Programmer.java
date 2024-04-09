package coupling;

public class Programmer {
    public void code (Laptop laptop) {
        System.err.println("Coding...");
        laptop.compile();
    }
}
