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
class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class PersonNameException extends Exception {
    public PersonNameException(String message) {
        super(message);
    } 
}
class PersonAgeException extends Exception {
    public PersonAgeException(String message) {
        super(message);
    } 
}
public class EXCEPTION004 {
    public static void check(Person p) throws PersonNameException, PersonAgeException{
        if(p.getName().length() > 40 || p.getName().isEmpty() || p.getName() == null) {
            throw new PersonNameException("Name is not valid");
        }
        else if(p.getAge() < 0 || p.getAge() > 120 ) {
            throw new PersonAgeException("Age is not valid");
        }
        else {
             System.out.println("Name: "+p.getName()+"--Age:"+p.getAge());
        }
       
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t-- >0) {
            String name = input.nextLine();
            int age = input.nextInt();
            input.nextLine();
            Person p = new Person(name, age);
            try {
                check(p);
            } catch (PersonNameException e) {
                System.out.println(e.getMessage());
            }
            catch (PersonAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
