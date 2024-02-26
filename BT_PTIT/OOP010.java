/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */
public class OOP010 {
    
    private String name;
    private String location;
    private int weight;
    
    public OOP010(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }
    
    public OOP010(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }
    
    public OOP010(String name, int weight) {
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }
    
    public String toString() {
        return this.name + " (" + this.weight + "kg) " + "can be found from the "+ this.location;
    }
    public static void main(String[] args) {
        OOP010 tapeMeasure = new OOP010("Tape measure");
        OOP010 plaster = new OOP010("Plaster", "home improvement section");
        OOP010 tyre = new OOP010("Tyre", 5);
        
        System.out.println(tapeMeasure.toString());
        System.out.println(plaster.toString());
        System.out.println(tyre.toString());
    }
}
