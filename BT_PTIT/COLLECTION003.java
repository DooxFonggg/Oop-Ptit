/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author phong
 */


public class COLLECTION003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t > 0) {
            HashMap<String, Integer> map = new HashMap<>();
            String[] s = input.nextLine().split(" ");
            for(int i = 0; i<s.length; i += 2) {
                  map.put(s[i], Integer.parseInt(s[i+1]));
            }
        int old = rarest(map);
        System.out.println(old);
        t--;
        }
    }
    
    public static int rarest(HashMap<String, Integer> map) {
        HashMap<Integer, Integer> count = new HashMap<>();
        // Đếm số lần xuất hiện của từng tuổi
        for (int age : map.values()) {
            count.put(age, count.getOrDefault(age, 0) + 1);
        }
        int minTuoi = Integer.MAX_VALUE;
        int minXh = Integer.MAX_VALUE; // so lan xuat hien
        for(int i : count.keySet()) {
//            min = Math.min(min, i);
            int cnt = count.get(i); // value
            if(cnt <  minXh || (cnt == minXh &&  i < minTuoi)) {
                minXh = cnt;
                minTuoi = i;
            }
        }
        return minTuoi;
    }
}
//// 22 2 25 4 20 4
//rs 20 hi 27 cwm 23 oww 28 dx 22 si 22 e 23 k 21