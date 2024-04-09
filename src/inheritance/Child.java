package inheritance;

public class Child extends Parent {





    public Child(int x) {
        super(x);
    }
    private int test() {

        super.getX();
        return 1;
    }
}
