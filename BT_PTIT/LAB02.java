/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */
import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class LAB02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String s1 = input.nextLine().trim();
        String[] s2 = input.nextLine().split("\"");
        for(int i=0; i<s2.length; i++) {
            System.out.println(s2[i]);
        }
        System.out.println(s1.equals(s2[1]));
         }
     
}
