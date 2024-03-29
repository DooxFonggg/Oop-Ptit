
package ExamMiddle;

class test {
        void display1() {
            System.out.println("ExamMiddle.Course.test.display()");
        }
}
public class Course {
    void display2() {
         System.out.println("ExamMiddle.Course.test.display2()");
    }
    public static void main(String[] args) {
        test t = new test();
        Course c = new Course();
        t.display1();
        c.display2();
    }
}
