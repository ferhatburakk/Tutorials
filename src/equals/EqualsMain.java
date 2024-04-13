package equals;

public class EqualsMain {
    public static void main(String[] args) {
        String s1 = "Ferhat";
        String s2 = "Ferhat";
        String s3 = new String("Ferhat");
        StringBuilder sb = new StringBuilder("Ferhat");

        System.err.println(s1 == s2); //true -> String Pool
        System.err.println(s1.equals(s2)); //true
        System.err.println(s1 == s3); // false -> s3 in Heap
        System.err.println(sb.toString() == s1); //false
        System.err.println(sb.toString().equals(s1)); //true
    }
}
