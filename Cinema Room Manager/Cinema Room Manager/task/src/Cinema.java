import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = sc.nextInt();

        ScreenRoom screenRoom = new ScreenRoom(rows, seats);
        showMenu(sc, screenRoom);
    }

    public static void showMenu(Scanner sc, ScreenRoom screenRoom) {
        while (true) {
            System.out.println("\n1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "3. Statistics\n" +
                    "0. Exit");

            switch (sc.nextInt()) {
                case 1:
                    screenRoom.Visualize();
                    break;
                case 2:
                    screenRoom.BuyTicket(sc);
                    break;
                case 3:
                    screenRoom.ShowStatistics();
                    break;
                case 0:
                    return;
            }
        }
    }
}