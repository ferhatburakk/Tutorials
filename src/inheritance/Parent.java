package inheritance;

public class Parent {

    private int x;
    private DefaultKeywordClass defaultKeywordClass;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private String test(String myString){
        defaultKeywordClass.def = 5;
        return myString + "test1";
    }

    public Parent(int x) {
        this.x = x;
    }


}
