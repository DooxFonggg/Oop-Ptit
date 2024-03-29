/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom03_oop24;

/**
 *
 * @author phong
 */
public class myDate {
    int day;
    int month;
    int year;
    // my date là dạng int
    public myDate(int date) {
        this.day = date%100;
        date /= 100;
        this.month = date%100;
        date /= 100;
        this.year = date;
    }
    public myDate(String date) {
        this.year = Integer.parseInt(date.substring(0, 4));
        this.month = Integer.parseInt(date.substring(4,6));
        this.day = Integer.parseInt(date.substring(6,8));
    }
}



