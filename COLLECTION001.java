
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phong
 */
class Warehouse {
    private HashMap<String, Integer> products;
    public Warehouse() {
        products = new HashMap<>();
    }
    public void addProduct(String product, int stock) {
        products.put(product, stock);
    }
    public int stock(String product) {
         return products.containsKey(product) ? products.get(product) : -99;
    }
}
public class COLLECTION001 {
    public static void main(String[] args) {
        
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 10);
        warehouse.addProduct("coffee", 7);

        System.out.println("prices:");
        System.out.println("milk: " + warehouse.stock("milk"));
        System.out.println("coffee: " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
    }
}
