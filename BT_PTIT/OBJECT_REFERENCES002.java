/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */
class SimpleDate {
    private int day;
    private int month;
    private int year;
    
    public SimpleDate(int day, int month, int year) {
         this.day = day;
         this.month = month;
         this.year = year;
    }
    
    public boolean equals(SimpleDate obj) {
        SimpleDate other = (SimpleDate) obj;
        return (day == other.day && month ==  other.month && year == other.year);
    }
}
public class OBJECT_REFERENCES002 {
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
