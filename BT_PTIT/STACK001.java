package BT_PTIT;

import java.util.Scanner;
import java.util.Stack;

public class STACK001 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t > 0) {
            Stack<Integer> st = new Stack<>();
            String[] s = input.nextLine().split(" ");
            for (String i : s) {
                st.push(Integer.parseInt(i));
            }
            compressDuplicates(st);
            System.out.println();
            t--;
        }
    }

    public static void compressDuplicates(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int count = 1;
        int current = s.pop();
        Stack<Integer> tmp = new Stack<>();
        while (!s.isEmpty()) {
            int top = s.pop();
            if (top == current) {
                count++;
            } else {
                tmp.push(current);
                tmp.push(count);
                current = top;
                count = 1;
            }
        }
        tmp.push(current);
        tmp.push(count);
        
        while(tmp.size() > 2) {
            int cnt = tmp.pop();
            int r = tmp.pop();
            System.out.print(cnt + " " + r+" ");
        }
        int cnt = tmp.pop();
        int r = tmp.pop();
        System.out.print(cnt + " " + r);
  
  }
}
