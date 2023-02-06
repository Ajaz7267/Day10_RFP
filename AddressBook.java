package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class AddressBook{



    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;
    AddressBook person = new AddressBook();

    public List<AddressBook> people = new ArrayList<AddressBook>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {

        System.out.println("First Name :");
        person.firstName = sc.nextLine();

        System.out.println("Last Name :");
        person.lastName = sc.nextLine();

        System.out.println("Address :");
        person.address = sc.nextLine();

        System.out.println("City :");
        person.city = sc.nextLine();

        System.out.println("State :");
        person.state = sc.nextLine();

        System.out.println("Zip :");
        person.zip = sc.nextLine();

        System.out.println("Phone Number :");
        person.phoneNumber = sc.nextLine();

        System.out.println("Email :");
        person.email = sc.nextLine();

        people.add(person);
    }
}



