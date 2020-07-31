package machine;

import java.util.Scanner;

public class CoffeeMachine {

    Scanner scan = new Scanner(System.in);
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    private CoffeeMachine(Coffee type) {
        this.water = type.water;
        this.milk = type.milk;
        this.beans = type.beans;
        this.cups = type.cups;
        this.money = type.money;
    }

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine(Coffee.MACHINE);
        boolean status;
        do {
            status = machine.makeAction(machine);
        } while (status);
    }

    enum Coffee {
        MACHINE(400, 540, 120, 9, 550),
        ESPRESSO(250, 0, 16, 1, 4),
        LATTE(350, 75, 20, 1, 7),
        CAPPUCINO(200, 100, 12, 1, 6);
        private int water;
        private int milk;
        private int beans;
        private int cups;
        private int money;

        Coffee(int water, int milk, int beans, int cups, int money) {
            this.water = water;
            this.milk = milk;
            this.beans = beans;
            this.cups = cups;
            this.money = money;
        }
    }

    public boolean makeAction(CoffeeMachine machine) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scan.nextLine();

        switch (action) {
            case "exit":
                return false;

            case "remaining":
                returnState(machine);
                break;

            case "take":
                System.out.println("I gave you $" + machine.money);
                machine.money = 0;
                break;

            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String choice = scan.nextLine();

                switch (choice) {
                    case "back":
                        break;

                    default:
                        if (choice.equals("1")) {
                            choice = "ESPRESSO";
                        } else if (choice.equals("2")) {
                            choice = "LATTE";
                        } else if (choice.equals("3")) {
                            choice = "CAPPUCINO";
                        }
                        if (machine.water < Coffee.valueOf(choice).water) {
                            System.out.println("Sorry, not enough water!");
                        } else if (machine.milk < Coffee.valueOf(choice).milk) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (machine.beans < Coffee.valueOf(choice).beans) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (machine.cups < Coffee.valueOf(choice).cups) {
                            System.out.println("Sorry, not enough disposable cups!");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
                            machine.water -= Coffee.valueOf(choice).water;
                            machine.milk -= Coffee.valueOf(choice).milk;
                            machine.beans -= Coffee.valueOf(choice).beans;
                            machine.cups -= Coffee.valueOf(choice).cups;
                            machine.money += Coffee.valueOf(choice).money;
                        }
                        break;
                }
                break;

            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                machine.water += scan.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                machine.milk += scan.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                machine.beans += scan.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                machine.cups += scan.nextInt();
                break;
        }
        return true;
    }

    public void returnState(CoffeeMachine machine) {
        System.out.println("The coffee machine has:");
        System.out.println(machine.water + " of water");
        System.out.println(machine.milk + " of milk");
        System.out.println(machine.beans + " of coffee beans");
        System.out.println(machine.cups + " of disposable cups");
        System.out.println(machine.money + " of money");
    }
}