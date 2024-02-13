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
public class bai3 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String s = input.nextLine();
            if (s.isEmpty()) {
                break; 
            }
            int c = 0;
            for (int i = 0; i < s.length(); i++) {
                char b = s.charAt(i);
                if (Character.isDigit(b)) {
                    c++;
                }
            }
            System.out.println(c);
        }
        input.close();
    }
}
