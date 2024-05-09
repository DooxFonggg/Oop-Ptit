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

interface Moveable {
    public void move(int dx, int dy);   
}
class Organism implements Moveable {
    int x;
    int y;
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "x:"+x+";y:"+y;
    }
    @Override
    public void move(int dx, int dy) {
        x = x+dx;
        y = y+dy;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
class Herd extends Organism {
    ArrayList<Organism> os;
    public Herd(int x, int y) {
        super(x,y);
        this.os = new ArrayList<>();
    }
    public String toString() {
        return "x:"+x+";y:"+y;
    }
    public void addToHerd(Organism o) {
        os.add(o);
    }
    @Override
    public void move(int dx, int dy) {
        for(Organism i : os) {
            i.move(dx, dy);
            System.out.println(i.toString());
        }
    }
        
}
public class POLYMORPHISM002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- > 0) {
            String[] s = input.nextLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            Organism o = new Organism(x, y);
            o.move(1, 1);
            System.out.println(o.toString());
        } 
    }
}
