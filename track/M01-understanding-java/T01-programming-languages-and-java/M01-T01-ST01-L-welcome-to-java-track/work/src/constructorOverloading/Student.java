package constructorOverloading;

public class Student {
     String name;
     int age;
     double height;

     public Student() {
          this.name = null;
          this.age = 0;
          this.height = 0.0;
     }

     public Student(String name) {
          this.name = name;
     }

     public Student(String name, int age, double height) {
          this.name = name;
          this.age = age;
          this.height = height;
     }

     void display() {
          System.out.println(name);
          System.out.println(age);
          System.out.println(height);
     }
}
