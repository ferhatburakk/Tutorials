package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ferhat", 23));
        list.add(new Student("Ahmet", 26));
        list.add(new Student("Mehmet", 35));
        java.util.Comparator<Student> comparator = (s1, s2) -> s1.getAge() > s2.getAge() ? 1 : -1;

        Collections.sort(list, comparator);

        System.err.println(list);
    }
}
