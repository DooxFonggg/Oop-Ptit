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
class Point {
    int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double slope (Point other) {
        if(this.x == other.x) {
            return -1;
        }
        else if(this.y == other.y) {
            return 0.0;
        }
        else {
            return (double)(other.y-this.y)/(other.x-this.x);
        }
    }
}
public class OOP009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t > 0) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            Point point1 = new Point(x1, y1);
            Point point2 = new Point(x2, y2);
            double result = point1.slope(point2);
            System.out.print(result+"\n");
            t--;
        }
        input.close();
    }
}
