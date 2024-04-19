/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_Nhom3_01_01;

import BT_PTIT.Student;
import java.util.Scanner;

/**
 *
 * @author phong
 */
class person {
    private String name;
    private String address;
    public person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String toString() {
        return name + " - " + address;
    }
}
class student extends person {
    private static int credit = 0;
    public student(String name, String address) {
        super(name, address);
    }
    public void study() {
        credit++;
    }
    public int getCredit() {
        return credit;
    }
}
public class student_class {
    public static void main(String[] args) {
        student s = new student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(s.toString());
        System.out.println("Study credits " + s.getCredit());
        s.study();
        System.out.println("Study credits " + s.getCredit());
    }
}
