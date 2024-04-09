package stream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class StreamExamples {

    public static void main(String[] args) {

        int[] numbers = {2, 5, 7, 9, 11, 13, 17, 19, 23};

        //binary search

        binarySearch(numbers, 9);

    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Eğer key, ortadaki öğeye eşitse, arama başarılı, orta öğenin indisini döndür.
            if (arr[mid] == key) {
                return mid;
            }

            // Eğer key, ortadaki öğeden küçükse, arama sol yarıya odaklanır.
            if (key < arr[mid]) {
                right = mid - 1;
            }

            // Eğer key, ortadaki öğeden büyükse, arama sağ yarıya odaklanır.
            else {
                left = mid + 1;
            }
        }

        // Öğe bulunamadıysa, olması gereken indis değerinin eksi bir gösterimini döndür.
        return -1;
    }

    private static void examples() {
        //Bir dizi tam sayıdan oluşan bir liste verildiğinde,
        // listenin içindeki tek sayıların karesini alarak
        // bu karelerin toplamını bulan bir Java programı yazın.

        List<Integer> list = Arrays.asList(3, 4, 11, 8, 2);

        Integer result = list.stream().filter(n -> n % 2 != 0).map(n -> n * n).reduce(0, Integer::sum);

        System.err.println(result);

        //Bir diziden oluşan bir liste verildiğinde,
        // listedeki çift sayıları filtreleyerek bunların karelerini alıp
        // ardından küçükten büyüğe sıralayarak bu karelerden oluşan
        // yeni bir liste döndüren bir Java programı yazın.

        System.err.println(list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted()
                .collect(Collectors.toList()));

        //Bir metin dizisi verildiğinde,
        // bu dizideki her bir kelimenin uzunluğunu bulup
        // bunların toplamını hesaplayan bir Java programı yazın.

        String[] words = {"ferhat", "ahmet", "test"};

        int sum = Arrays.stream(words)
                .map(String::length)
                .reduce(0, (a, b) -> a + b);

        System.err.println(sum);

        //Bir dizi tam sayıdan oluşan bir liste verildiğinde,
        // listedeki tek sayıların karesini alarak
        // bunları bir araya getirip bir metin dizisi oluşturan bir Java programı yazın.
        // Tek sayılar arasında boşluk olmalıdır.
        List<Integer> list1 = Arrays.asList(3, 4, 11, 8, 2);

        String res = list1.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .map(Object::toString)
                .collect(Collectors.joining(" "));

        System.err.println(res);
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {

        return asList(names).stream().filter(n -> n.length() > 5).mapToInt(n -> n.length()).sum();

    }

    public static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static List<String> transform2(List<List<String>> collection) {

        return collection.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
    }

    public static Person getOldestPerson(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    public static Person getOldestPerson2(List<Person> people) {
        return people.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
    }

    public static int calculate(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int calculate2(List<Integer> numbers) {
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    public static int calculate3(List<Integer> numbers) {
        return numbers.stream().reduce((i, sum) -> i + sum).orElse(0);
    }

    public static Set<String> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }

    public static Set<String> getKidNames2(List<Person> people) {
        return people.stream().filter(n -> n.getAge() < 18).map(n -> n.getName()).collect(Collectors.toSet());
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    public static Map<Boolean, List<Person>> partitionAdults2(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(person -> person.getAge() >= 18, Collectors.toList()));
    }

    public static String namesToString(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToString2(List<Person> people) {

        return "Names: " + people.stream().map(Person::getName).collect(Collectors.joining(", ")) + ".";


    }

    //if the input list is (3,44), the output should be 'o3,e44'. çift ise başına e, tek ise o
    public static String getString(List<Integer> list) {
        return list.stream().map(n -> n.intValue() % 2 == 0 ? "e" + n : "o" + n).collect(Collectors.joining(","));
    }


}
