package week05;

public class MainAnimal {
	public static void main(String[] args) {
		
		   // Use the Constructor to set the information upon 
		   //     creation of the Object.
		Animal elephant = new Animal("Dumbo", "elephant", 8000, 108, "Disneyland");
		
		elephant.describe();
		
		System.out.println("\n\nLet's access individual fields:");
		System.out.println("-------------------------------");
		System.out.println("Our elephant is named: " + elephant.getName());
		
		// EXAMPLE:  Create an Object with the Default Constructor
		//           and use the Setters to store information
		System.out.println("\n\n\n");
		Animal kangaroo = new Animal();
		
		kangaroo.setName("Jack");
		kangaroo.setType("Kangaroo");
		kangaroo.setWeight(150);
		kangaroo.setHeight(48);
		kangaroo.setLocation("Taronga Zoo");
		
		kangaroo.describe();
	}
}