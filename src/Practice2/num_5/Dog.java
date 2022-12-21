package Practice2.num_5;

public class Dog {
    String name;
    int age;
    Dog(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public int getAge() {return age;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public int HumanAgeOfTheDog() {return age*7;}

    public String toString() {
        return "Name = " + name + ", age = " + age;
    }
}
