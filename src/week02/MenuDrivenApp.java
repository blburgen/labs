package week02;

import java.util.*;

public class MenuDrivenApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		String name = sc.nextLine();
		
		System.out.println("Welcome, " + name);
		
		int selection = 0;
		double total = 0.00;
		
		while (selection != 4) {
			System.out.println("Select an option:");
			System.out.println("1) add candybar to shopping cart: 1.99");
			System.out.println("2) add cheese to shopping cart: 6.95");
			System.out.println("3) add soccer ball to shopping cart: 12.99");
			System.out.println("4) chekc out");
			
			selection = sc.nextInt();
			
			switch (selection) {
				case 1:
					total += 1.99;
					break;
				case 2:
					total += 6.95;
					break;
				case 3: 
					total += 12.99;
					break;
				default:
					System.out.println("Please pick a valid option.");
			};
		};
		System.out.println("Your current total is: " + total);
		sc.close();
	}

}
