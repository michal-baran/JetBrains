package contacts;

import java.util.Scanner;

class Menu {
    public void run() {
        PhoneBook phoneBook = new PhoneBook(addContact());
    }

    public Contact addContact() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        String name = scan.nextLine();
        System.out.println("Enter the surname of the person:");
        String surName = scan.nextLine();
        System.out.println("Enter the number:");
        String phoneNumber = scan.nextLine();
        Contact contact = new Contact(name, surName, phoneNumber);
        return contact;
    }
}

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();
    }
}