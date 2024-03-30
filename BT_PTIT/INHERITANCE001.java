/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */

class Persion {
     private String name;
     private String address;
     
     public Persion(String name, String address) {
         this.name = name;
         this.address = address;
     }
     
     public String toString() {
         return address.toString();
     }
     
     public String getName() {
         return name;
     }
     public String getAddress() {
         return address;
     }
}

class Student extends Persion {
    private static int credit = 0;
    
    public Student(String name, String address) {
        super(name, address);
    }
    public void study(){
        credit++;
    }
    public int getCredits() {
        return credit;
    }
}

public class INHERITANCE001 {
    public static void main(String[] args) {
        Student s = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(s.getName() + " - " + s.getAddress());
        System.out.println("Study credits " + s.getCredits());
        s.study();
        System.out.println("Study credits " + s.getCredits());
    }
}
