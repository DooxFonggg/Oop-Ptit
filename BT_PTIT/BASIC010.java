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
public class BASIC010 {
      public static int swapDigitPairs(int n) {
        int result = 0;
        int multiplier = 1;
        
        while (n >= 10) {
            int digit1 = n % 10;
            n /= 10;
            int digit2 = n % 10;
            n /= 10;
            
            result += (digit1 * 10 + digit2) * multiplier;
            multiplier *= 100;
        }
        
        if (n > 0) {
            result += n * multiplier;
        }
        
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTests = scanner.nextInt();
        
        for (int i = 0; i < numTests; i++) {
            int n = scanner.nextInt();
            System.out.println(swapDigitPairs(n));
        }
        
        scanner.close();
    }
      
}
