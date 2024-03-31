/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phong
 */
class Item {
    private String name;
    private double price;
    private double discount;
    
    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    
    public double getPrice() {
        return this.price;
    }  
    
    public double getDiscount() {
        return this.discount;
    }
    
     public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return String.format("%s $%s (-$%s)", name, df.format(price), df.format(discount));
    }
}
class Employee {
    private String name;
    
    public Employee (String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
class GroceryBill {
    private Employee clerk;
    private List<Item> items = new ArrayList<>();
    private double total = 0;
    
    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
    }
    public void add(Item item)  {
        items.add(item);
        total += item.getPrice();
    }
    
    public double getTotal() {
        return this.total;
    }
    
    public Employee getClerk() {
        return this.clerk;
    }
    
    public List<Item> getItem() {
        return this.items;
    }
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#0.00");
        sb.append("items:\n");
        for (Item item : items) {
            sb.append("   " + item.toString()).append("\n");
        }
        sb.append("total: $").append(df.format(total)).append("\n");
        sb.append("Clerk: ").append(clerk.getName());
        return sb.toString();
    }
}

class DiscountBill extends GroceryBill {
    private double discountAmount = 0;
    public DiscountBill(Employee clerk) {
        super(clerk);
    }
    @Override 
    public void add(Item item) {
        super.add(item);
        discountAmount += item.getDiscount();
    }
    @Override
    public String toString() {
      DecimalFormat df = new DecimalFormat("#0.00");
        StringBuilder sb = new StringBuilder();
        sb.append("\n\nitems:\n");
        for (Item item : super.getItem()) {
            sb.append("   " + item.toString()).append("\n");
        }
        sb.append("sub-total: $").append(df.format(getTotal())).append("\n");
        sb.append("discount: $").append(df.format(discountAmount)).append("\n");
        sb.append("total: $").append(df.format(getTotal() - discountAmount)).append("\n");
        sb.append("Clerk: ").append(getClerk().getName()).append("\n");
        return sb.toString();
    }
}
public class INHERTANCE003 {
    public static void main(String[] args) {
        Employee clerk1 = new Employee("Grocery Bill");
        GroceryBill g = new GroceryBill(clerk1);
        g.add(new Item("item 1", 2.30, 0));
        g.add(new Item("item 2", 3.45, 0));
        
        System.out.print(g.toString());
        Employee clerk2 = new Employee("Discount Bill");
        DiscountBill d = new DiscountBill(clerk2);
        d.add(new Item("item 3", 20, 15));
        d.add(new Item("item 4", 40, 35));
        d.add(new Item("item 5", 50, 35));
        
        System.out.print(d.toString());
    } 
}
