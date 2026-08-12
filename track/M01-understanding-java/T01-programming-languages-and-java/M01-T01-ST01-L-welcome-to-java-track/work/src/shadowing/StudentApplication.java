package shadowing;

public class StudentApplication {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input("Anil", 18, 5.6);
        s1.display();
    }
}
