/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamMiddle;

import java.util.Scanner;

/**
 *
 * @author phong
 */


class myDate {
    private int year;
    private int month;
    private int day;
    
    public myDate(int date) {
        this.day = date%100;
        date/=100;
        this.month = date%100;
        date/=100;
        this.year = date;
    }
    public myDate(String date) {
        this.year = Integer.parseInt(date.substring(0, 4));
        this.month = Integer.parseInt(date.substring(4,6));
        this.day = Integer.parseInt(date.substring(6,8));
    }
    public void display() {
        System.out.println("day"+this.day+" month"+this.month+" year"+this.year);
    }
}

class bankAccount
{
    int name;

    public bankAccount(int name1) {
        name = name1;
    }
    
    void display() {
        System.out.println(name);
    }
    
}

class OneClass {
    int name;
    
    public OneClass(int name) {
        this.name = name;
    }
}

public class test {
    
    private void backAccont() {
       
           System.out.println("test");
      
    }
    
      public static void main(String[] args) {
//          String date = "20020815";
//          int dat = 20020815;
//          myDate d = new myDate(date);
//          myDate d1 = new myDate(dat);
//          d1.display();
            bankAccount cl = new bankAccount(2);
            cl.display(); // looxi
            OneClass oc = new OneClass(2);
            System.out.println(oc.toString());
            
//     test t = new
    }
}

class Point
{
    public int x;
    public int y;
    public Point(int a, int b)
    {
        x =a;
        y = b;
    }
}

class Rect
{
    Point a;
    Point b;
    public Rect(Point a, Point b)
    {
        this.a =a;
        this.b = b;
    }
}
