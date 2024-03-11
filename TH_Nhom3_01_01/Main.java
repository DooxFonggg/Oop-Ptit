/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_Nhom3_01_01;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class Main {
    
    public static int countString(String s) {
        String[] w = s.split(" ");
        return w.length;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t>0) {
            String st = input.nextLine();
            int k = st.length();
            int l = countString(st);
            System.out.println(k + " " + l);
            t--;
        }
        input.close();
    }
}

