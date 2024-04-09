package coupling;

public class Desktop implements Computer{
    @Override
    public void compile() {
        System.err.println("Desktop compiling...");
    }
}
