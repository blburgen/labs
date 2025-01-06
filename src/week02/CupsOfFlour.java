package week02;

public class CupsOfFlour {

	public static void main(String[] args) {
		int cupsOfFlour = 0;

		while (cupsOfFlour < 5) {

		  System.out.println("Scooping a cup of flour into the bowl");

		  cupsOfFlour += 1;

		  System.out.println("There are " + cupsOfFlour + " cups of flour in the bowl."); 

		}
		
		for (int cupOfFlour = 1; cupOfFlour <= 5; cupOfFlour++) {

			  System.out.println("Scooping a cup of flour into the bowl.");

			  System.out.println("There are " + cupOfFlour + " cups of flour in the bowl."); 

			}

	}

}
