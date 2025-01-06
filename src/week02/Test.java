package week02;

public class Test {

	public static void main(String[] args) {
		String name = "Tom";
		
		if (name == "Sam") {
			System.out.println("Hello Sam!");
		} else {
			System.out.println("You are not Sam, " + name + ".");
		};
		
		int age = 14;
		
		if (age >= 16) {
			System.out.println("you can get your license!");
		} else {
			System.out.println("Please wait " + (16-age) + " year(s) to get your license.");
		};
		
		double costOfMilk = 2;
		
		if(costOfMilk <= 2) {
			System.out.println("Buying 2");
		} else if (costOfMilk <= 3) {
			System.out.println("Buying 1");
		} else {
			System.out.println("Not buying any milk.");
		};
		
		char grade = 'A';
				
		switch (grade) {
			case 'A':
				System.out.println("90%");
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			default:
				System.out.println("0%");
		};

	}

}
