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

class MyMethods {
    public static void m(int x) {
        try {
            m2(x);
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println(2);
        } catch (IOException e) {
            System.out.println(3);
        }
    }

    public static void m2(int x) throws IOException {
        System.out.println(4);
        if (x == 1)
            throw new IOException();
        if (x == 0)
            throw new ArithmeticException();
        System.out.println(5);
    }
}
public class ELAB2306 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        MyMethods.m(t);
    }
}
