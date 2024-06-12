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

public class LAB01_ClassMain {
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       int t = input.nextInt();
       input.nextLine();
       while(t-- > 0) {
           String s1 = input.nextLine();
           String[] s2 = s1.split(" ");
           System.out.println(s1.length() + " " + s2.length);
       }
       
    }
}
