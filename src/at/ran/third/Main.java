package at.ran.third;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("hanserl", "müller");

        System.out.println(student1.getFirstName());
        student1.printStudent();

    }
}
