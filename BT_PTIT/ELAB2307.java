/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */
import java.io.*;
import java.util.Scanner;

class Utils {
    public static void u(String s) {
        try {
            System.out.println(s);
            z(s);
            try {
                System.out.println(Integer.parseInt(s)+1);
            } catch (Exception e) {
                System.out.println(s.toUpperCase());
            }
        } catch (ClassNotFoundException e) {
            System.out.println(1);
        }
    }

    public static void z(String s) throws ClassNotFoundException{
        System.out.println(2);
        if (s.length() == 1)
            throw new ClassNotFoundException();
        System.out.println(3);
    }
}
public class ELAB2307 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        Utils.u(s);
    }
}
