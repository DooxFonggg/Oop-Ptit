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
public class bai1 {
 public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String s;
        input.nextLine();
        while(t>0) {
            s = input.nextLine();
            System.out.printf(s+"\n");
            t--;
        }
        input.close();
    }
}
