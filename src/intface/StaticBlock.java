package intface;

public class StaticBlock {

    public StaticBlock () {
        System.err.println("Constructor");
    }

    static {
        System.err.println("static blok.");
    }
}
