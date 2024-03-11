import java.math.BigDecimal;
import java.util.Scanner;

public class Big_Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int t = 0; t < testCases; t++) {
            String[] numbers = scanner.nextLine().split(" ");
            BigDecimal sum = BigDecimal.ZERO;
            boolean hasDecimal = false; // Flag to track if any decimal number is found
            
            for (String number : numbers) {
                BigDecimal bd = new BigDecimal(number);
                BigDecimal decimalPart = bd.remainder(BigDecimal.ONE);
                
                if (decimalPart.compareTo(BigDecimal.ZERO) != 0) {
                    sum = sum.add(decimalPart);
                    hasDecimal = true; // Set flag to true if decimal part is found
                }
            }
            
            if (!hasDecimal) {
                System.out.println("0");
            } else {
                System.out.println(sum.toPlainString());
            }
        }
    }
}
