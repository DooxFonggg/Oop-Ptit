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
public class STRING {
     public static String findLongestWord(String sentence) {
        String[] s = sentence.split(" ");
        String maxl = "";
        for(String x : s) {
            if(x.length() >= maxl.length()) {
                maxl = x;
            }
        }
        return maxl; 
     }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- > 0) {
            String s = input.nextLine();
            System.out.println(findLongestWord(s));
                            
        }
        input.close();
    }
    
}
