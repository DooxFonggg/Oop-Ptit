/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */
public class TET_HOLIDAY {
    
    private String name;
    private String breed;
    private int age;
   
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void printDogDetail() {
        System.out.println("Name:"+this.name+"--Breed:"+this.breed+"--Age:"+this.age);
    }
    public static void main(String[] args) {
        TET_HOLIDAY Dog = new TET_HOLIDAY();
        Dog.setName("Micky");
        Dog.setBreed("Husky");
        Dog.setAge(12);
        Dog.printDogDetail();
    }
}
