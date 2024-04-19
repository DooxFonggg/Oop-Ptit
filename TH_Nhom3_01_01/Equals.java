/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_Nhom3_01_01;

import java.util.Scanner;

/**
 *
 * @author phong
 */
class Song {
    private String name;
    private String author;
    private int duration;
    public Song(String name, String author, int duration) {
        this.name = name;
        this.author = author;
        this.duration = duration;
    }
    public boolean equals(Song obj) {
        // tạo constructor trc đó
       Song other = (Song) obj;
        return duration == other.duration && 
               name.equals(other.name) && 
               author.equals(other.author);
        
    }
}
public class Equals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- > 0) {
            String[] s1 = input.nextLine().split(" ");
            Song so = new Song(s1[0], s1[1], Integer.parseInt(s1[2]));
            String[] s2 = input.nextLine().split(" ");
            Song so2 = new Song(s2[0], s2[1], Integer.parseInt(s2[2]));
            System.out.println(so.equals(so2));
        }
        input.close();
    }
}
