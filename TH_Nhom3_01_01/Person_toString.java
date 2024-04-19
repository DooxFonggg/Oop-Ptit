/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_Nhom3_01_01;

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
public class Person_toString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t -- > 0) {
            String name = input.nextLine();
            String address = input.nextLine();
            person p = new person(name, address);
            System.out.println(p.toString());
        }
        input.close();
    }
}
