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

class HanhTinh {
    String name;
    double khoiluong;
    double bankinh;
    double G = 6.67300e-11;
    public HanhTinh(String name, double khoiluong, double bankinh) {
        this.name = name;
        this.khoiluong = khoiluong;
        this.bankinh = bankinh;
    }
    public double trongLucBeMat() {
         
        return khoiluong * G / (bankinh * bankinh);
    }
    public double khoiLuongBeMat(double khoiluong1vat) {
      return (trongLucBeMat()/9.8)*khoiluong1vat ;
      
    }

}

public class ELAB2314 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kl = 5.976e+24;
        double bk = 6.37814e6;
        double g = 6.67300e-11;
        double trongLuongTraiDat = kl*g/(bk*bk);
        
        String name = input.nextLine();
        double khoiluong = input.nextDouble();
        double bankinh = input.nextDouble();
        double khoiluong1vat = input.nextDouble();
        HanhTinh h = new HanhTinh(name, khoiluong, bankinh);
        double kq = h.trongLucBeMat()/trongLuongTraiDat * khoiluong1vat;
        System.out.printf("Your weight on %s is %.2f%n", h.name,kq);
    
    }
}
