/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */
class Money {
    int euros;
    int cents;
    double res;
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
        this.res = euros+cents*0.01;
    }
    public int getEuro() {
        return euros;
    }
    public int getCent() {
        return cents;
    }
    public String toString() {
        if(res < 0) {
            res = 0;
        }
        return String.format("%.2f",res)+"e";
    }
    public double getRes() {
        return res;
    }
    public Money plus(Money added) {
        int newcents = this.cents + added.getCent();
        int neweuros = this.euros + added.getEuro();
        return new Money( neweuros, newcents);
    }
    public boolean lessThan(Money compared) {
        if(this.res > compared.getRes()) {
            return false;
        }
        else {
            return true;
        }
    }
    public Money minus(Money ninus) {
        int newct = this.cents - ninus.getCent();
        int neweu = this.euros - ninus.getEuro();
        return new Money(neweu, newct);
    }
}
public class CONTEST006 {
    public static void main(String[] args) {
        Money a= new Money(10, 8);
        Money b = new Money(5,5);
        System.out.println(a.toString());
        System.out.println(b.toString());
        Money c = a.plus(b);
        System.out.println(c.toString());
        Money u = new Money(10,0);
        Money y = new Money(3,0);
        Money w = new Money(5,0);
        System.out.println(u.lessThan(y));
        System.out.println(y.lessThan(w));
        Money m = new Money(10,0);
        System.out.println(m.toString());
        Money n = new Money(3, 50);
        System.out.println(n.toString());
        Money o = m.minus(n);
        System.out.println(o.toString());
         o = o.minus(m);
        System.out.println(o.toString());
    }
}
