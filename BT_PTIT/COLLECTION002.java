/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */

import java.util.*;

public class COLLECTION002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine(); 
        while(t > 0) {
            String[] s = input.nextLine().split(" ");
            ArrayList<String> al = new ArrayList<>();
            for(String i : s) {
                al.add(i);
            }
            ArrayList<String> result = new ArrayList<>();
            result = removeShorterStrings(al);
            for(int i = 0;  i < result.size()- 1; i++) {
                System.out.print(result.get(i) + " " );
            }
            
            int after = result.size() - 1;
            System.out.print(result.get(after));
            System.out.println();
            t--;
        }
        
    }
    
    public static ArrayList<String> removeShorterStrings(ArrayList<String> ar) {
        ArrayList<String> tmp = new ArrayList<>();
        int c = ar.get(0).length(); // lay do dai ai dau tien cua chuoi
        for(int i = 0; i < ar.size(); i += 2) {
            if(i + 1 < ar.size()) {
                if(ar.get(i).length() > ar.get(i + 1).length()) {
                    tmp.add(ar.get(i));
                } else {
                    tmp.add(ar.get(i + 1));
                }
            } else {
                tmp.add(ar.get(i));
            }
        }
        return tmp;
    }
    
}
