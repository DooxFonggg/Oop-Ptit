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

public class STRING_005 {
    public static boolean check(String s) {
        boolean[] checkAt = new boolean[26];
        s = s.toLowerCase();
        for(int i = 0; i< s.length(); i++) {
            char k = s.charAt(i);
            if(k >= 'a' && k <= 'z') {
                checkAt[k - 'a'] = true; // danh dau da co
            }
        }
        for(int i =0; i<26; i++) {
            if(!checkAt[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- >0) {
            String s = input.next();
            System.out.println(check(s));
        }
        input.close();
    }
}
