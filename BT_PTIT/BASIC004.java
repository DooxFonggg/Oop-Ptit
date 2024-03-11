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
public class BASIC004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int t = input.nextInt();
        input.nextLine();
        while(t>0) {
            String name = input.nextLine();
            System.out.println("Hi " + name);
            t--;
        }
        input.close();
    }
}
