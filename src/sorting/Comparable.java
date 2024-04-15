package sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ferhat", 23));
        list.add(new Student("Ahmet", 26));
        list.add(new Student("Mehmet", 35));

        Collections.sort(list);

        System.err.println(list);
    }
}

