/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_Nhom3_01_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author phong
 */
public class towsum {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- >0){
            int n = scanner.nextInt();
            String[] input = scanner.nextLine().split(" ",n+1);
            int target = Integer.parseInt(input[n]);
            int[] arr = new int[n+1];
            for(int i = 0; i < n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            int[] result = solve(arr, n, target);
            if(result.length == 0){
                System.out.println("Not found");
            }else{
                String res = "";
                for(int i :result){
                    res = res + " "+ i;
                }
                System.out.println(res);
            }
        }       
    }
    public static int[] solve(int[] arr, int n, int target){
        Map<Integer,Integer> nuMap = new HashMap<>();
        for(int i = 0; i < n;i++){
            int remain = target - arr[i];
            if(nuMap.containsKey(remain)){
                return new int[] {nuMap.get(remain),i};
            }
            nuMap.put(arr[i], i);
        }
        return new int[]{};
    }
}
