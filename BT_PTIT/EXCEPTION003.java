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
class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}

public class EXCEPTION003 {
    public static void hasVowel(String s) throws NoVowelException {
          String vowels = "aeiouAEIOU";
          for(int i=0; i<s.length(); i++) {
              if(vowels.indexOf(s.charAt(i)) != -1) {
                System.out.println("String has vowels");
                return;
              }
          }
          throw new NoVowelException("String not contain vowels");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- > 0) {
            String s = input.nextLine();
            try {
                hasVowel(s);
            }
            catch(NoVowelException e) {
                System.out.println(e.getMessage());
            }
        } 
        input.close();
    }
}
