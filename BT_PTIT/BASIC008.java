/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */
public class BASIC008 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Numbers between 100 and 200, divisible by 9:");
        for(int i = 108; i<=198; i++) {
            if(i%9 == 0) {
                sum+=i;
                System.out.println(i);
            }
           
        }
        System.out.println(sum);
    }
}
