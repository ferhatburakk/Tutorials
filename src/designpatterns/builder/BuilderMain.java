package designpatterns.builder;

public class BuilderMain {

    public static void main(String[] args) {

        Person person = Person.builder().age(5).firstName("Ferhat").build();

        System.err.println(person.toString());
    }
}
