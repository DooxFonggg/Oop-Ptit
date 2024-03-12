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
public class BASIC011 {

    public static int minGap(int[] arr) {
        if(arr.length < 2) {
            return 0;
        }
        int minArr =  Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
             if (diff < minArr) {
                minArr = diff;
            }
        }
        return minArr;
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int t = input.nextInt();
       input.nextLine();
       while(t>0) {
           String[] ip = input.nextLine().split(" ");
           int[] arr = new int[ip.length];
           for(int i = 0; i<arr.length; i++) {
               arr[i] = Integer.parseInt(ip[i]);
           }
           System.out.println(minGap(arr));
           t--;
       }
       input.close();
    }
}
