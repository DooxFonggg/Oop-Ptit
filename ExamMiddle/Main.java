package ExamMiddle;
class Student {
    private int age;
    private String name;
    public static int n = 0;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        n++;
    }
    static void display() {
        System.out.println(n);
    }
}
public class Main {

    public static void main(String[] args) {
        Student s1 = new Student(12, "fong");
        Student s2 = new Student(12, "he");
        Student.display();
    }

}
