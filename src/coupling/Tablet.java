package coupling;

public class Tablet implements Computer{
    @Override
    public void compile() {
        System.err.println("Tablet compiling...");
    }
}
