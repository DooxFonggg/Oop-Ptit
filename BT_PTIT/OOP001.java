/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */
class BankAccount {
    private String id;
    private double balance = 0;
    private int trasaction = 0;
    public BankAccount(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public int getTradition() {
        return trasaction;
    }
    public void deposit(double amount) {
        balance += amount;
        if(balance >= 0 && balance <= 500) {
            trasaction++;
        }
    }
    public void withDraw(double amount) {
        balance -= amount;
        if(balance > 0) {
            trasaction++;
        }
    }
    
    public void transactioFee(double amount) {
        double t = 0;
        int a = trasaction;
        while(a > 0) {
            t += amount*a;
            a--;
        }
        balance -= t;
        if(balance  > 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
public class OOP001 {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount("Jimmy");
        savings.deposit(10.00);
        savings.deposit(50.00);
        savings.deposit(10.00);
        savings.deposit(70.00);
        
        savings.transactioFee(5.00);
        savings.transactioFee(10.00);

    }
}
