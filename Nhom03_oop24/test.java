/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom03_oop24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author phong
 */
public class test {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String line = input.nextLine();
            String[] numbers = line.split("\\s+");
            for (String number : numbers) {
                    arr.add(Integer.parseInt(number));
            }
            System.out.println(longestSortedSequence(arr));
            t--;
            // Đọc dòng mới để tiếp tục
        }
    }

    public static int longestSortedSequence(ArrayList<Integer> arr) {
        int max = 0;
        int currentMax = 1;
        if (arr.size() == 0) {
            return 0;
        }
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) >= arr.get(i - 1)) {
                currentMax++;
            } else {
                max = Math.max(max, currentMax);
                currentMax = 1;
            }
        }
        return Math.max(max, currentMax);
    }
}