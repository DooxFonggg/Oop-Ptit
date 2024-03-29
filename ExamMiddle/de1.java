/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamMiddle;

/**
 *
 * @author phong
 */
class Exam{
static void exam(int i, Integer wi, Integer[] a, int len){ // tạo một hàm tĩnh tên exam truyền vào 3 tham số 
      a[0] = wi; //phần tử đầu của mảng gán bằng wi
       wi = a[len-1]; // wi gán bằng phần tử cuối của mảng
       wi = i; // wi gán bằng i;
}
}
public class de1 {
    public static void main(String[] args) {
      Integer[] arr = {10, 20}; // tạo 1 mảng gồm 2 phần tử 10 và 20
       Exam.exam(30, arr[1], arr, arr.length);//gọi phương thức exam tương ứng i = 30, wi = 20; mảng a = arr, len = arr.length =2
       // như vậy arr[0] = 20;
       // wi = arr[2-1] = 20;
       // wi = i = 30;
       // => arr ={20,20);
       System.out.println(arr[0]);//20
       System.out.println(arr[1]);//20
}
}

