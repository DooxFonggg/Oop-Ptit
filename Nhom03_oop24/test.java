/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom03_oop24;

import java.util.HashMap;

/**
 *
 * @author phong
 */
public class test {
    public static int[] quiz(int[] nums, int target) {
           HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int[] nums = {3,4,15,10};
        int target = 19;
        int[] result = quiz(nums, target);
        for(int i = 0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }
}