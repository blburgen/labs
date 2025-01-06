package Week04;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		List<String> sports = new ArrayList<>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		
		for (int i=0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		};
		System.out.println("-------------------");
		sports.remove(1);
		for (String sport : sports) {
			System.out.println(sport);
		};
		

	}

}
