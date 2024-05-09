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

abstract class Shape {
    protected String name;
    public Shape(String name) {
        this.name = name;
    }
    public abstract double calcylateArea();
    public abstract void displayinfo();
}
class Rectangle extends Shape {
    double width;
    double length;
    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }
    @Override
     public double calcylateArea() {
         return length*width;
     }
     
     @Override
     public void displayinfo() {
         System.out.println( String.format("Shape:%s|Area:%.2f", name, length*width));
     }
        
     
}

class Circle extends Shape {
    double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
        @Override
     public double calcylateArea() {
         return Math.PI*radius*radius;
     }
     
     @Override
     public void displayinfo() {
         System.out.println( String.format("Shape:%s|Area:%.2f", name, Math.PI*radius*radius));
     }
        
}
public class OOP005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- > 0) {
            String[] s = input.nextLine().split(" ");
            if(s.length == 3) {
                String name = s[0];
                double width = Double.parseDouble(s[1]);
                double height = Double.parseDouble(s[2]);
                Rectangle r = new Rectangle(name, width, height);
                r.displayinfo();
            }
            else {
                String name = s[0];
                double radius = Double.parseDouble(s[1]);
                Circle c = new Circle(name, radius);
                c.displayinfo();
            }
            
        }
        input.close();
    }
}
