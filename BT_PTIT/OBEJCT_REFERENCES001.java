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
        Song other = (Song) obj;
        
        return((name.equals(other.name)) && (author.equals(other.author) && (duration == other.duration) ));
    } 
    
}
public class OBEJCT_REFERENCES001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        input.nextLine();
        
        while(t > 0) {
            String[] s1 = input.nextLine().split(" ");
            String[] s2 = input.nextLine().split(" ");
            
            
            String name1 = s1[0];
            String author1 = s1[1];
            int duration1 = Integer.parseInt(s1[2]);
            
            String name2 = s2[0];
            String author2 = s2[1];
            int duration2 =Integer.parseInt(s2[2]);
            Song so1 = new Song(name1,author1,duration1);
            Song so2 = new Song(name2, author2,duration2);
            
            System.out.println(so1.equals(so2));
            t--;
        } 
    }
}
