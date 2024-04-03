package BT_PTIT;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author phong
 */
import java.util.Scanner;

public class BASIC002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t > 0) {
            String s = input.nextLine();
            System.out.println(s);
            t--;
        }
        input.close();
    }
}
