/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author phong
 */
public class LAB01_BigDec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t>0) {
            String[] s = input.nextLine().split(" ");
            BigDecimal sum = BigDecimal.ZERO;
            for(String number : s) {
                BigDecimal n = new BigDecimal(number); // chuyển thành số lớn
                sum = sum.add(n.remainder(BigDecimal.ONE));
            }
            System.out.println(sum);
            t--;
        }
        input.close();
    }
}

