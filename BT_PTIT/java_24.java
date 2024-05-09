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

class tinh {

    int x;
    int y;

    public tinh(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add() {
        return x + y;
    }

    public int sub() {
        return x - y;
    }

    public int div() {
        if (y == 0) {
            return -1;
        }
        return x / y;
    }
}

public class java_24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String[] s = input.nextLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            tinh ti = new tinh(x,y);
            System.out.println(ti.add() + " " + ti.sub() + " " + ti.div());
        }
        input.close();
    }
}
