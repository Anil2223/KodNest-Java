package shadowing;

public class Student {
    String name;
    int age;
    double height;

    public void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

}
