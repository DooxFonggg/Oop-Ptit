package BT_PTIT;

import java.util.Scanner;

class FlightBooking {
    public String flightId = "OOP24";
    private static int seatAvailable = 180;

    //Your code goes here
    static void checkBooking(String s, String number) {
        if (s.equals("Booking")) {
            seatAvailable--;
            System.out.print("[Seat Available: " + seatAvailable + "]");
        } else if (s.equals("Confirmed")) {
            System.out.print("--User " + number + " Confirmed--[Seat Available: " + seatAvailable + "]");
        } else if (s.equals("Cancel")) {
            seatAvailable++;
            System.out.print("[Seat Available: " + seatAvailable + "]");
        }
    }

    static void resetSeats() {
        seatAvailable = 180;
    }
}

public class LAB02_FlightBooking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        input.nextLine();
        while (t > 0) {
            FlightBooking.resetSeats(); // Reset số lượng chỗ trống về 180 cho mỗi trường hợp test
            String[] x = input.nextLine().split(" ");
            for (int i = 0; i < x.length; i += 2) {
                String number = x[i];
                String s = x[i + 1];
                FlightBooking.checkBooking(s, number);
                
            }
            System.out.println();
            t--;
        }
        input.close();
    }
}
