/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

import com.sun.source.tree.TryTree;
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
    public static void CheckFileExtension(String file) {
        try {
            if(file == null || file.isEmpty()) {
                throw new NotJavaFileException("Not java file exception.Mark is -1");
            }
            else if(file.endsWith(".java")) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }catch(NotJavaFileException fileName) {
            System.out.println(fileName.getMessage());
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
                check.CheckFileExtension(fileName);
            
            
        }
        input.close();
        
    }
}

