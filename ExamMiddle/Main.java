import java.util.Scanner;

class Paper {
    String name;
    static String nn;
    public static int cnt = 0;
    
    public Paper(String name, String nn) {
        this.name = name;
        this.nn = nn;
    }
    
    public static void check() {
        if(nn.equals("VN")) {
            cnt++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String[] s = input.nextLine().split(" ");
            String name = s[0];
            String nn = s[1];
            Paper p = new Paper(name, nn);
            Paper.check(); // Passing 'nn' as parameter
            System.out.println(Paper.cnt);
        }
    }
}
