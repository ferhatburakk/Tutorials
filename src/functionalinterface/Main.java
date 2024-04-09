package functionalinterface;

public class Main {

    public static void main(String[] args) {

        MyInterface myInterface;
        myInterface = () -> 3.14;
        System.err.println(myInterface.getPI());

        MyInterface2 myInterface2;
        myInterface2 = (text) -> {
            StringBuilder sb = new StringBuilder(text);
            return sb.reverse().toString();
        };
        System.err.println(myInterface2.reverse("ferhat"));

        GenericInterface<String> reverse;
        reverse = (text) -> {
            return new StringBuilder(text).reverse().toString();
        };

        GenericInterface<Integer> factorial;
        factorial = (number) -> {
            int result = 1;
            for (int i = number; i >= 2; i--) {
                result *= i;
            }
            return result;
        };

        System.err.println(reverse.func("ferhat"));
        System.err.println(factorial.func(5));
    }
}
