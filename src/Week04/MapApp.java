package Week04;

import java.util.*;

public class MapApp {
	
	static Scanner scanner = new Scanner(System.in);
	static Map<String, String> phoneBook = new HashMap<>();

	public static void main(String[] args) {
		
		int choice = 0;
		
		while (choice != 4) {
			
			printMenu();
			
			choice = getUserChoice();
			
			if (choice == 1) {
				displayPhoneBook();
			} else if (choice == 2) {
				addContact();
			} else if (choice == 3) {
				deleteContact();
			} else if (choice == 4) {
				System.out.println("Goodbye");
			} else {
				System.out.println("Please pick a valid option!");
			};
		};

	}
	
	public static void printMenu() {
		System.out.println("1) Display Phone Book");
		System.out.println("2) Add new Contact");
		System.out.println("3) Delete Contact");
		System.out.println("4) Exit");
		System.out.println("------------------------------------");
	};
	
	public static int getUserChoice() {
		return scanner.nextInt();
	};
	
	public static void displayPhoneBook() {
		Set<String> phoneNumbers = phoneBook.keySet();
		for (String phoneNumber : phoneNumbers) {
			System.out.println(phoneNumber + ": " + phoneBook.get(phoneNumber));
		};
	};
	
	public static void addContact() {
		System.out.print("Enter Phone Number: ");
		String phoneNumber = scanner.next();
		System.out.println("Enter Name: ");
		String name = scanner.next();
		phoneBook.put(phoneNumber, name);
		System.out.println("Added " + phoneNumber + ": " + name);
	};
	
	public static void deleteContact() {
		System.out.print("Enter Phone Number to Delete: ");
		String phoneNumber = scanner.next();
		System.out.println("Removed " + phoneNumber + ": " + phoneBook.remove(phoneNumber));
	};

}
