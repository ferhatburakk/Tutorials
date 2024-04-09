package coupling;

public class LooseCoupling {

    public static void main(String[] args) {
        Computer tablet = new Tablet();
        Computer desktop = new Desktop();
        Programmer2 programmer2 = new Programmer2();

        programmer2.code(tablet);
        programmer2.code(desktop);

    }
}
