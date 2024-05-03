/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */
class A{
    public int x=0x1a;
    public void display(){
        System.out.println(x);
    }
}
class B extends A{
    public int x=0x1b;
}
public class ELAB2311 {
     public static void main(String[] args){
        
	// Khai báo đối tượng b thuộc lớp A. Đối tượng b được chuyển đổi kiểu thành đối tượng thuộc lớp B.
        A b = new B();
        
        // Gọi phương thức display() của đối tượng b.
	b.display();
    }
}
