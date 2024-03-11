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
public class BASIC007 {
    public static void Leadyear(int year) {
        if((year%4 == 0 && year%100 != 0)) {
            System.out.println( year + " : Leap-year");
        }
        else if((year % 400 == 0)) {
            System.out.println( year + " : Leap-year");
        }
        else {
            System.out.println( year + " : Non Leap-year");
        }
    }
    public static void check(int year) {
        int a = 2024;
        if(year >= a) {
            int b = year-a;
            if(b%4==0) {
                System.out.println( year + " : Leap-year");
                        
            }
            else {
                 System.out.println( year + " : Non Leap-year");
            }
        }
        else {
               int b = year-a;
            if(b%4==0) {
                System.out.println( year + " : Leap-year");
                        
            }
            else {
                 System.out.println( year + " : Non Leap-year");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        input.nextLine();
        while(t>0) {
            int year = input.nextInt();
//            Leadyear(year);
            check(year);
            t--;
        }
    }
}
