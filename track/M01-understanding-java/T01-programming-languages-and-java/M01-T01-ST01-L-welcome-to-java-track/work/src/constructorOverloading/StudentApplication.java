package constructorOverloading;

public class StudentApplication {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Anil");
        s2.display();

        Student s3 = new Student("Anil", 80, 5.55);
        s3.display();
    }
}
