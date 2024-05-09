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

class AmountException extends Exception {
    public AmountException(String message) {
        super(message);
    }
}

class Amount {
    String currency;
    int amount;
    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    } 
    public String getCurrency() {
        return currency;
    }
    public int getAmount() {
        return amount;
    }
    public void add(Amount amount) throws AmountException {
        if(!this.currency.equals(amount.getCurrency())) {
            throw new AmountException("Currency doesn't match");
        }
        else {
            System.out.println(this.amount + amount.getAmount());
        }
    }
    
}
public class EXCEPTION001 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int t = input.nextInt();
         input.nextLine();
         while(t-- > 0) {
             String[] s = input.nextLine().split(" ");
             String currency1 = s[0];
             int amount1 = Integer.parseInt(s[1]);
             Amount a1 = new Amount(currency1,amount1);
             String currency2 = s[2];
             int amount2 = Integer.parseInt(s[3]);
             Amount a2 = new Amount(currency2,amount2);
             try {
                 a1.add(a2);
                 
             }catch(AmountException e) {
                 System.out.println(e.getMessage());
             } 
         }
         input.close();
    }
}
