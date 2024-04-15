package sorting;

public class Student implements java.lang.Comparable<Student> {

    private String name;
    private int age;

    @Override
    public int compareTo(Student student) {
        if (this.age > student.age) {
            return 1;
        } else {
            return -1;
        }
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
