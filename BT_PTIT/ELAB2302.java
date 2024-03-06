import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private static int totalStudent = 0;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudent++;
    }
    
    public void display() {
        if (this.age >= 18) {
            System.out.println(this.name);
        }
    }
    
    public static int getTotal() {
        return totalStudent;
    }
}

public class ELAB2302 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        while (input.hasNextLine()) {
            String name = input.nextLine();
            if (name.isEmpty()) {
                break;
            }
            int age = Integer.parseInt(input.nextLine());
            Student s = new Student(name, age);
            students.add(s);
        }
        
        for (Student student : students) {
            student.display();
        }
        
        System.out.println(Student.getTotal());
        input.close();
    }
}
