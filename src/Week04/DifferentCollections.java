package Week04;

import java.util.*;

public class DifferentCollections {

	public static void main(String[] args) {
//Lists
		List<String> students = new ArrayList<>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null);
		
		for (String student : students) {
			System.out.println(student);
		};
		
		System.out.println(students.get(2));
		System.out.println(students.get(0));
//Set
		Set<String> states = new HashSet<>();
		states.add("Alabama");
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arkansas");
		states.add("California");
		states.add(null);
		
		System.out.println(states.size());
		System.out.println(states.contains("Alabama"));
		
		for (String state :  states) {
			System.out.println(state);
		};
//Map
		Map<Integer, String> racerPlacements = new HashMap<>();
		racerPlacements.put(1,"Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		};
		
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers) {
			System.out.println(racer);
		};
		
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("Augment", "make (something) greater by adding to it; increase.");
		dictionary.put("Diminish", "make or become less");
		dictionary.put("Ostentatious", "characterized by vulgar or pretentious display; designed to impress or attract notice");
		
	}

}
