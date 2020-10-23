import java.util.Scanner;

public class ScreenRoom {
    char[][] seats;
    int totalSeats;

    public ScreenRoom(int r, int s) {
        seats = new char[r][s];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                seats[i][j] = 'S';
            }
        }
        totalSeats = r * s;
    }

    public void BuyTicket(Scanner sc) {
        System.out.println("Enter a row number:");
        int row = sc.nextInt();

        System.out.println("Enter a seat number in that row:");
        int seat = sc.nextInt();

        seats[row - 1][seat - 1] = 'B';

        System.out.println("Ticket price: $" + (totalSeats > 60 && row > seats.length / 2 ? 8 : 10));
    }

    public void Visualize() {
        System.out.println("\nCinema:");
        for (int i = 0; i <= seats.length; i++) {
            for (int j = 0; j <= seats[0].length; j++) {
                if (i > 0 && j > 0) {
                    System.out.print(seats[i - 1][j - 1] + " ");
                }
                if (i == 0 & j > 0) {
                    System.out.print(j + " ");
                }
                if (i > 0 & j == 0) {
                    System.out.print(i + " ");
                }
                if (i == 0 & j == 0) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}