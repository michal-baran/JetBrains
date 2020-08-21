package contacts;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<Contact> contacts = new ArrayList<>();

    PhoneBook(Contact newContact) {
        contacts.add(newContact);

        System.out.println("A Phone Book with a single record created!");
    }
}