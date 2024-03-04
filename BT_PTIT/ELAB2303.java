/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */

class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        MyStuff other = (MyStuff) obj;
        return name.equals(other.name);
    }
}

public class ELAB2303 {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");
        
        // a.
        if (m2.equals(m1))
            System.out.println("value compared: same");
        else
            System.out.println("different");

        // b. Viết thêm code vào dấu ...
        // So sánh tham chiếu của m1 và m2
        if (m2 == m1)
            System.out.println("reference compared: same");
        else
            System.out.println("reference compared: different");
    }    
}
