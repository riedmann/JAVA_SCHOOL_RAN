package at.ran.third;

public class Student {
    private String firstName;
    private String lastName;
    private int age = 7;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printStudent() {
        System.out.println(this.getAge() + " " + this.firstName + " " + this.lastName);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
