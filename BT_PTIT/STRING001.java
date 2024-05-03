/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phong
 */

public class STRING001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- > 0) {
            String[] s = input.nextLine().split(" ");
            int index = Integer.parseInt(s[1]);
            System.out.printf("The character at position %d is %c%n",index, s[0].charAt(index));
        }
        input.close();
    }
}
