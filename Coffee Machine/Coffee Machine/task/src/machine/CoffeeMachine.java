package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = {
                {400, 540, 120, 9, 550}, //machine at start
                {250, 0, 16, 1, -4}, //espresso
                {350, 75, 20, 1, -7}, //latte
                {200, 100, 12, 1, -6} //cappucino
        };

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scan.nextLine();

            switch (action) {
                case "exit":
                    return;

                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(arr[0][0] + " of water");
                    System.out.println(arr[0][1] + " of milk");
                    System.out.println(arr[0][2] + " of coffee beans");
                    System.out.println(arr[0][3] + " of disposable cups");
                    System.out.println(arr[0][4] + " of money");
                    break;

                case "take":
                    System.out.println("I gave you $" + arr[0][4]);
                    arr[0][4] = 0;
                    break;

                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    var choice = scan.nextLine();
                    switch (choice) {
                        case "back":
                            break;
                        default:
                            if (arr[0][0] < arr[Integer.parseInt(choice)][0]) {
                                System.out.println("Sorry, not enough water!");
                            } else if (arr[0][1] < arr[Integer.parseInt(choice)][1]) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (arr[0][2] < arr[Integer.parseInt(choice)][2]) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (arr[0][3] < arr[Integer.parseInt(choice)][3]) {
                                System.out.println("Sorry, not enough disposable cups!");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                for (int i = 0; i < arr[0].length; i++) {
                                    arr[0][i] -= arr[Integer.parseInt(choice)][i];
                                }
                            }
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    arr[0][0] += scan.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    arr[0][1] += scan.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    arr[0][2] += scan.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    arr[0][3] += scan.nextInt();
                    break;
            }
        }
    }
}