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
class TacoBox {
    int taco;
    
//    TacoBox(int taco) {
//        this.taco = taco;
//    }
    
    public int tacoRemaining() {
        return taco;
    }
    public void eat() {
        taco = taco - 1;
    }
    
}
class TripleTacoBox extends TacoBox {
     public TripleTacoBox() {       
          taco = 3;
      }
        
}
class CustomTacoBox extends TacoBox {
    int customTaco;
    public CustomTacoBox(int customTaco) {
        this.customTaco = customTaco;
        this.taco = customTaco;
    }
    
}
public class INTERFACE002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TripleTacoBox t = new TripleTacoBox();
        t.eat();
        t.eat();
        System.out.printf("Triple taco boxes left: %d%n",t.tacoRemaining());
        CustomTacoBox  c = new CustomTacoBox(8);
        c.eat();
        System.out.printf("Custom taco boxes left: %d%n", c.tacoRemaining());
        
    }
}
