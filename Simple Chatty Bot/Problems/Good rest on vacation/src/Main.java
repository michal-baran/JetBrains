import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int oneNightCost = scanner.nextInt();

        System.out.println(days * foodCostPerDay + flightCost * 2 + (days - 1) * oneNightCost);
    }
}