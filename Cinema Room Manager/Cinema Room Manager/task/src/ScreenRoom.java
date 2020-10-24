import java.util.Scanner;

public class ScreenRoom {
    char[][] seats;
    int totalSeats;
    int tickets;
    double percentage;
    int income;
    int profit;

    public ScreenRoom(int r, int s) {
        tickets = 0;
        percentage = 0.0;
        income = 0;
        seats = new char[r][s];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                seats[i][j] = 'S';
            }
        }
        totalSeats = r * s;
    }

    public void BuyTicket(Scanner sc) {
        while (true) {
            System.out.println("Enter a row number:");
            int row = sc.nextInt();
            System.out.println("Enter a seat number in that row:");
            int seat = sc.nextInt();

            if (row > seats.length || seat > seats[0].length) {
                System.out.println("Wrong input!");
            } else if (seats[row - 1][seat - 1] != 'B') {
                seats[row - 1][seat - 1] = 'B';
                int price = totalSeats > 60 && row > seats.length / 2 ? 8 : 10;

                System.out.println("Ticket price: $" + (price));

                income += price;
                tickets++;
                percentage = (double) tickets / totalSeats * 100.0;
                return;
            } else {
                System.out.println("That ticket has already been purchased!\n");
            }
        }
    }

    public void Visualize() {
        System.out.println("\nCinema:");
        for (int i = 0; i <= seats.length; i++) {
            for (int j = 0; j <= seats[0].length; j++) {
                System.out.print(i > 0 ? (j > 0 ? seats[i - 1][j - 1] + " " : i + " ") : j > 0 ? j + " " : "  ");
            }
            System.out.println();
        }
    }

    public void ShowStatistics() {
        if (totalSeats < 60) {
            profit = totalSeats * 10;
        } else {
            int half = seats.length / 2;
            profit = (half * 10 + (seats.length - half) * 8) * seats[0].length;
        }
        System.out.printf("\nNumber of purchased tickets: %d\nPercentage: %3.2f%%\nCurrent income: $%d\nTotal income: $%d", tickets, percentage, income, profit);
    }
}