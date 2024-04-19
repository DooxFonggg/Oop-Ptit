/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phong
 */
class car {
    protected double price;
    protected int year;
    public car(double price , int year) {
        this.price = price;
        this.year = year;
    }
    public String toString() {
        return String.format("Price: %,.2f VND | Year: %d ", price, year);
    }
    
    public double calcuLateSalePrice() {
        return price;
    }
}

class sportCar extends car {
    public sportCar(double price, int year) {
        super(price, year);
    }
    @Override
    public double calcuLateSalePrice() {
        if(year > 2018) {
            return price*0.8;
        }
        else if(year > 2010) {
            return  price*0.5;
        }
        else {
            return price*0.1;
        }
    }
    @Override
    public String toString() {
        return String.format("Price: %,.2f VND | Year: %d ", price, year);
    }
}
class classicCar extends car {
    public classicCar(double price, int year) {
        super(price, year);
    }
    @Override
    public double calcuLateSalePrice() {
        return price*1.12 + 20000000;
    }
    @Override
    public String toString() {
        return String.format("Price: %,.2f VND | Year: %d ", price, year);
    }
}
public class ELAB2308 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        ArrayList<sportCar> l1 = new ArrayList<>();
        ArrayList<classicCar> l2 = new ArrayList<>();
        input.nextLine();
        while(t-- > 0) {
            String[] s = input.nextLine().split(" ");
            String type = s[0];
            double price = Double.parseDouble(s[1]);
            int year = Integer.parseInt(s[2]);
            if(type.equals("SC")) {
                sportCar sc = new sportCar(price, year);
                price = sc.calcuLateSalePrice();
                System.out.println(String.format("Price: %,.2f VND | Year: %d", price, year));
                l1.add(new sportCar(price, year));
            }
            else if(type.equals("CC")) {
                classicCar cc = new classicCar(price, year);
                price = cc.calcuLateSalePrice();
                System.out.println(String.format("Price: %,.2f VND | Year: %d", price, year));
                l2.add(new classicCar(price, year));
            }
        }
        double max1 = 0;
        double max2 = 0;
        for(sportCar sc : l1) {
            max1 = Math.max(max1, sc.price);
        }
        for(classicCar cc : l2) {
            max2 = Math.max(max2, cc.price);
        }
        if(max1 > max2) {
            System.out.println(String.format("Most Expensive: %,.2f VND", max1));
        }
        else {
            System.out.println(String.format("Most Expensive: %,.2f VND", max2));
        }
        input.close();
    }
}
