package TH_Nhom3_01_01;

public class Func {
    public static int func(int x) {
        int sum = 0;
        outer: for (int i = 0; i < x; i++) {
            sum++;
            if (i == 4) continue;
            inner: for (int j = 0; j < x; j++) {
                if (j == i) continue outer;
                if (i == 3) break;
                if (i == 2) break outer;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
