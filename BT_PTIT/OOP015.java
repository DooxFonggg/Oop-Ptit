/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */
import java.util.Scanner;

class Person {
    String name;
    String address;
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String toString() {
        return name+" - "+address;
    }
}
public class OOP015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- >0) {
            String name = input.nextLine();
            String address = input.nextLine();
            Person p = new Person(name, address);
            System.out.println(p.toString());
        }
    }
}
