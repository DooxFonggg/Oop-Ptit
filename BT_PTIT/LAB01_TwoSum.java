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

public class LAB01_TwoSum {
    public static int[] findIndices(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < testCases; t++) {
            String[] input = scanner.nextLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(input[i + 1]);
            }
            int target = Integer.parseInt(input[n + 1]);
            int[] result = findIndices(nums, target);
            if (result[0] == -1 && result[1] == -1) {
                System.out.println("Not found");
            } else {
                System.out.println(result[0] + " " + result[1]);
            }
        }
    }
}
