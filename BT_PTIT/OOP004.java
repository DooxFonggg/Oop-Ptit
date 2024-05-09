/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */
import java.util.*;

class point {
    int x;
    int y;
    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void move(int dx, int dy) {
        x = x+dx;
        y = y+dy;
    }
    public double distanceTo(point p) {
        int x_total = this.x - p.getX();
        int y_total = this.y - p.getY();
        return Math.sqrt(x_total*x_total + y_total*y_total);
    }
}
public class OOP004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- > 0) {
            String[] s = input.nextLine().split(" ");
            int x1 = Integer.parseInt(s[0]);
            int y1 = Integer.parseInt(s[1]);
            point a = new point(x1,y1);
            a.move(1,1);
            int x2 = Integer.parseInt(s[2]);
            int y2 = Integer.parseInt(s[3]);
            point b = new point(x2, y2);
            double line  = a.distanceTo(b);
            System.out.println(String.format("%.2f", line));
        }
        input.close();
    }
    
}
