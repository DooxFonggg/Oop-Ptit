/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom03_oop24;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while(t > 0) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int num4 = input.nextInt();
            int num5 = input.nextInt();
            System.out.printf(num1+num2+num3+num4+num5+"\n");
            t--;
        }
        input.close();
    }
}
