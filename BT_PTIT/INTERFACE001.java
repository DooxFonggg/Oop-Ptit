/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

import java.awt.print.Book;

/**
 *
 * @author phong
 */
interface Packable {
    double weight();
}

 class book implements Packable {
     String author;
     String name;
     double weights;
     public book(String author, String name, double weights) {
         this.author = author;
         this.name = name;
         this.weights = weights;
     }
     public double weight() {
         return weights;
     }
     public String toString() {
         return author+": "+name;
     }
     
 }

class CD implements Packable {
    String artist;
    String name;
    int year;
    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }
    public double weight() {
        return 0.1;
    }
    public String toString() {
        return artist+": "+ name+" ("+year+")";
    }
}
public class INTERFACE001 {
    public static void main(String[] args) {
        book b1 = new book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        System.out.println(b1.toString());
        book b2 = new book("Robert Martin", "Clean Code", 1);
        System.out.println(b2.toString());
        book b3 = new book("Kent Beck", "Test Driven Development", 0.5);
        System.out.println(b3.toString());
        CD c1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        System.out.println(c1.toString());
        CD c2 = new CD("Wigwam", "Nuclear Nightclub", 	1975);
        System.out.println(c2.toString());
        CD c3 = new CD("Rendezvous Park","Closer to Being Here", 2012);
        System.out.println(c3.toString());
    }
}
