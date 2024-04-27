/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

import java.util.*;

/**
 *
 * @author phong
 */
public class ELAB2309 {
       class Final {
         void f(boolean[] a, String[] b, Integer c) {
            System.out.println(b[0]);
            a[0] = true;
            c = c + 1;
            System.out.println(a[0]);
            System.out.println(c);
        }
       
         void f(int d, char e, StringBuffer f) {
            System.out.println(d);
            d = d + (int)e;
            System.out.println(f);
        }
        void f(double g, byte i, Float h){
            g = g + h;
            System.out.println(i+g);
        }
    }
    public static void main(String[] args) {
        int a = 10;
        double b = 3.14;
        char c = 'c';
        String[] d = {"OOP", "2023"};
        Integer e = 1;
        boolean[] f = {false, true};
        StringBuffer g = new StringBuffer("Khoa Vien Thong");
        byte h = 20;
        Float i = 0.5f;
        
        // (*) Your code goes below
        Scanner input = new Scanner(System.in);
        ELAB2309 main = new ELAB2309();
        Final fn = main.new Final();
        String[] s = input.nextLine().split(" ");
        if(s[0].equals("a") && s[1].equals("c") && s[2].equals("g")) {
            fn.f(a, c, g);
        }
        else if(s[0].equals("f") && s[1].equals("d") && s[2].equals("e")) {
            fn.f(f, d, e);
        }
        else if(s[0].equals("b") && s[1].equals("h") && s[2].equals("i")) {
            fn.f(b, h, i);
        }
        else {
            System.out.println("Intvalid input");
        }   
    }        
}
