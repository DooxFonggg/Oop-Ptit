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
public class BASIC009 {
    public static int quadrant(int x, int y) {
        if(x == 0 || y == 0) {
            return 0;
        }
        else if(x>0 && y>0) {
            return 1;
        } 
        else if(x<0 && y>0) {
            return 2;
        }
        else if(x<0 && y<0) {
            return 3;
        }
        else {
            return 4;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        input.nextLine();
        while(t>0) {
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(quadrant(x, y));
            t--;
        }
        input.close();
    }
}
