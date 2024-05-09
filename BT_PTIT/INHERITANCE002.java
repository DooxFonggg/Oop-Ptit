/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

import java.util.ArrayList;

/**
 *
 * @author phong
 */
abstract class Box {
    public abstract void addItem(Item item);
    public abstract boolean islnBox(Item item);
    
}
class Item {
    String name;
    int weight;
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }
    
}
class BoxWithMaxWeight extends Box {
    ArrayList<Item> items;
    int maxWeight;
    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    @Override
    public void addItem(Item item) {
        if(maxWeight - item.getWeight() >= 0) {
            items.add(item);
            maxWeight -= item.getWeight();
        }
    }

    @Override
    public boolean islnBox(Item item) {
         for(Item i : items) {
             if(i.getName().equals(item.getName())) {
                 return true;
             }
         }
         return false;
    }

}
public class INHERITANCE002 {
    public static void main(String[] args) {
        BoxWithMaxWeight b = new BoxWithMaxWeight(10);
        Item i1 = new Item("Saludo", 5);
        b.addItem(i1);
        Item i2 = new Item("Pirkka", 5);
        b.addItem(i2);
        Item i3 = new Item("Kopi Luwak", 5);
        b.addItem(i3);
        System.out.println(b.islnBox(i1));
        System.out.println(b.islnBox(i2));
        System.out.println(b.islnBox(i3));
    }
}
