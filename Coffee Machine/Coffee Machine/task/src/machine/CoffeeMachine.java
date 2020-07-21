package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scan.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scan.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scan.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int requiredCups = scan.nextInt();
        int availableCups = 0;

        while (water >= 200 && milk >= 50 && beans >= 15) {
            availableCups++;
            water -= 200;
            milk -= 50;
            beans -= 15;
        }
        if (requiredCups == availableCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (requiredCups > availableCups) {
            System.out.println("No, I can make only " + availableCups + " cup(s) of coffee");
        } else
            System.out.println("Yes, I can make that amount of coffee (and even " + (availableCups - requiredCups) + " more than that)");
    }
}