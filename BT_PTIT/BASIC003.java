/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class BASIC003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String name;
        input.nextLine();
        while(t>0) {
            name = input.nextLine();
            System.err.println("Hi "+name);
            t--;
        }
        input.close();
    }
}
