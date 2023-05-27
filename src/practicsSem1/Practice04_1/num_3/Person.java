package practicsSem1.Practice04_1.num_3;

public class Person {
    String fullName;
    int age;

    Person() {
        fullName = "unnamed";
        age = 0;
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(fullName + " is moving");
    }

    void talk() {
        System.out.println(fullName + " is talking");
    }

    @Override
    public String toString() {
        return fullName + "\n" + age;
    }
}
