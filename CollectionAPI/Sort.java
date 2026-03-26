import java.util.*;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }
}

public class Sort {
    public static void main(String[] args) {

        List<Student> num = new ArrayList<>();

        num.add(new Student(21, "shubham"));
        num.add(new Student(22, "sham"));
        num.add(new Student(32, "ram"));
        num.add(new Student(24, "manas"));
        num.add(new Student(34, "gade"));

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.age - s2.age;
            }
        };

        Collections.sort(num, com);

        for (Student s : num)
            System.out.println(s);
    }
}
