/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamMiddle;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class STRING002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- > 0) {
             String s1 = input.nextLine();
            String s2 = input.nextLine();
            boolean res = s1.contains(s2);
            System.out.println(res);
        }
        input.close();
    }
    
}
