package TH_Nhom3_01_01;

import java.util.Scanner;

public class Number_Character {
    
    // Hàm đếm số lượng kí tự là chữ số trong một chuỗi
    static int countDigits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String s = input.nextLine();
            int c = countDigits(s);
            // In ra số lượng kí tự là chữ số của mỗi dòng
            System.out.println(c);
        }
        input.close(); // Đóng Scanner sau khi sử dụng xong
    }
}
