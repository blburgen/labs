package week02;

public class OldEnoughToDrive {

	public static void main(String[] args) {
		int ageRequiredToDrive = 16;
		int currentAge =14;
		
		if (currentAge >= ageRequiredToDrive) {
			System.out.println("This person can drive!");
		} else {
			System.out.println("This person cannot legally drive.");
		};
		
		double costOfEggs = 2.12;

		int numberOfDozensOfEggsToPurchase = 0;

		if (costOfEggs > 3) {

		  numberOfDozensOfEggsToPurchase = 1;

		} else if (costOfEggs > 2) {

		  numberOfDozensOfEggsToPurchase = 2;

		} else if (costOfEggs > 1) {

		  numberOfDozensOfEggsToPurchase = 3;

		} else {

		  numberOfDozensOfEggsToPurchase = 4;

		}

		System.out.println("I will buy " + numberOfDozensOfEggsToPurchase + " dozen eggs.");
		
		char grade = 'D';

		switch (grade) {

		    case 'A':

		        System.out.println("90-100");

		        break;

		    case 'B':

		        System.out.println("80-89");

		        break;

		    case 'C':

		        System.out.println("70-79");

		        break;

		    case 'D':

		        System.out.println("60-69");

		        break;

		    default:

		        System.out.println("0-59");

		}



	}

}
