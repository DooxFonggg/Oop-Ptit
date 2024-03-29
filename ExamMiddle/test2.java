/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamMiddle;

/**
 *
 * @author phong
 */
public class test2 {
    public static void main(String[] args) {
        System.out.println(func(5));
        }
    public static int func(int x) { // x = 5
    int sum = 0;
    outer: for (int i=0; i<x; i++){ //0 -> 4
        sum++; // i= 0 // sum = 1 // i = 1 sum = 3
        if (i==4) continue;
        inner: for (int j=i; j<x; j++){
            sum++;// j=i =0 -> 4 // sum = 2 // i = j = 1 sum =4
            if (j==i) continue outer; // i = j = 0
            if (i==1) break;
            if (i==2) break outer;
            sum++;
        }
    }
    return sum;
}
}
