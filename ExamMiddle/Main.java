package ExamMiddle;

import java.util.Scanner;

class Point {
    int x;
    int y;
    int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String display() {
        return (x + " " + y + " " + z);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    } 
    public int getZ() {
        return z;
    }
}

class Line {
    Point k;
    Point l;
    public Line(Point k, Point l) {
        this.k = k;
        this.l = l;
    }
    public Double chieudai() {
        int x1 = k.getX() + l.getX();
        int y1 = k.getY() + l.getY();
        int z1 = k.getZ() + l.getZ();

        
        return Math.sqrt(x1*x1+y1*y1+z1*z1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input.nextLine();
        while (input.hasNextLine()) {
            String[] s = input.nextLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
           int z = Integer.parseInt(s[2]);
            String[] s1 = input.nextLine().split(" ");
            int x1 = Integer.parseInt(s1[0]);
            int y1 = Integer.parseInt(s1[1]);
           int z1 = Integer.parseInt(s1[2]);
            Point p1 = new Point(x, y, z);
            Point p2 = new Point(x1, y1, z1);
            System.out.println(p1.display());
            System.out.println(p2.display());
            Line z = new Line(p1,p2);
        }
    }
}
