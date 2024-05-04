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


class NotJavaFileException extends Exception {
    public NotJavaFileException (String message) {
        super(message);
    }
}

class check {
    public static int CheckFileExtension(String file) {
        try {
            if(file == null || file.isEmpty()) {
                throw new NotJavaFileException("Not java file exception.Mark is -1");
            }
            else if(file.endsWith(".java")) {
                return 1;
            }
            else {
                return 0;
            }
        }catch(NotJavaFileException fileName) {
            System.out.println(fileName.getMessage());
            return -1;
        }
    }
}
public class EXCEPTION002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- > 0) {
            String fileName = input.nextLine();
            int n = check.CheckFileExtension(fileName);
            if(n != -1) {
                System.out.println(n);
            }
            
            
        }
        input.close();
        
    }
}

