package week02;

import java.util.*;

public class PasswordLogin {

	public static void main(String[] args) {
		// System.in is a standard input stream  
		boolean loggedIn = false;
		int tries = 0;
		Scanner sc= new Scanner(System.in);
		while (!loggedIn && tries < 3) {
			System.out.print("Enter username:  ");   
			String username = sc.nextLine();   
			System.out.print("Enter password: "); 
			String password = sc.nextLine();               
			if (username.equals("samy123") && password.equals("12345")) {
				System.out.println("Welcome back " + username);
				loggedIn = true;
			} else { 
				System.out.println("Inaccurate credentials!");
				tries++;
			}; // end of else
			if (tries == 3) {
				System.out.println("You are locked out!");
			};
		};
		sc.close();
	};   // end of main() 
};
