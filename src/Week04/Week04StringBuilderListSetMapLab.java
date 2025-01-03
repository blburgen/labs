//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package Week04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		System.out.print("Question#1: ");
		StringBuilder myString = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			myString.append(i);
			if (i < 9) {
				myString.append("-");
			};
		};
		System.out.println(myString.toString());
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		System.out.print("Question#2: ");
		List<String> myListString = new ArrayList<>();
		myListString.add("Tom was here!");
		myListString.add("I am hear");
		myListString.add("Where should I go?");
		myListString.add("Hi, how are you?");
		myListString.add("What?");
		System.out.println(myListString);
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.print("Question#3: ");
		System.out.println(shortestString(myListString));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		System.out.print("Question#4: ");
		System.out.println(newList(myListString));
		
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.print("Question#5: ");
		System.out.println(singleString(myListString));		
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		System.out.print("Question#6: ");
		System.out.println(containsString(myListString,"re"));
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		System.out.print("Question#7: ");
		List<Integer> longListInteger = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			longListInteger.add(i);
		};
		System.out.println(longListIntegerShortened(longListInteger));
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.print("Question#8: ");
		System.out.println(lengthOfStrings(myListString));

		
		// 9. Create a set of strings and add 5 values
		System.out.print("Question#9: ");
		Set<String> setOfStrings = new HashSet<>();
		setOfStrings.add("Why?");
		setOfStrings.add("Fun is it not?");
		setOfStrings.add("Five values");
		setOfStrings.add("Why not repeat?");
		setOfStrings.add("Five values1");
		System.out.println(setOfStrings);
		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.print("Question#10: ");
		System.out.println(newSetString(setOfStrings,'w'));

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.print("Question#11: ");
		System.out.println(newListSet(setOfStrings));
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set


		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		

	}

	// Method 15:
	
	
	
	// Method 14:
	

	
	// Method 12:
	

	
	// Method 11:
	public static List<String> newListSet(Set<String> setOfStrings){
		List<String> result = new ArrayList<>();
		for(String item :  setOfStrings) {
			result.add(item);
		}
		return result;
	};


	// Method 10:
	public static Set<String> newSetString(Set<String> setOfStrings,char x){
		Set<String> result = new HashSet<>();
		for (String item : setOfStrings) {
			if(item.toLowerCase().charAt(0) == x) {
				result.add(item);
			}
		};
		return result;
	}

	
	// Method 8:
	public static List<Integer> lengthOfStrings(List<String> myListString){
		List<Integer> result = new ArrayList<>();
		for(String item : myListString) {
			result.add(item.length());
		}
		return result;
	};

	
	// Method 7:
	public static List<List<Integer>> longListIntegerShortened(List<Integer>longListInteger){
		List<List<Integer>> shortenedList = new ArrayList<>();
		shortenedList.add(new ArrayList<>());
		shortenedList.add(new ArrayList<>());
		shortenedList.add(new ArrayList<>());
		shortenedList.add(new ArrayList<>());
		for(int item : longListInteger) {
			if(item%2 == 0) {
				shortenedList.get(0).add(item);
			};
			if(item%3 == 0) {
				shortenedList.get(1).add(item);
			};
			if(item%5 == 0) {
				shortenedList.get(2).add(item);
			};
			if(item%2 != 0 && item%3 != 0 && item%5 != 0) {
				shortenedList.get(3).add(item);
			};
		};
		//The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		return shortenedList;
	}

	
	// Method 6:
	public static List<String> containsString(List<String>myListString,String containsThis){
		List<String> resultList= new ArrayList<>();
		for (String item : myListString) {
			if(item.contains(containsThis)) {
				resultList.add(item);
			};
		};
		return resultList;
	};

	
	// Method 5:
	public static String singleString(List<String>myListString) {
		StringBuilder resultString = new StringBuilder();
		for (int i = 0; i < myListString.size(); i++) {
			resultString.append(myListString.get(i));
			if(i < myListString.size()-1) {
				resultString.append(",");
			};
		}
		return resultString.toString();
	};
	
	
	// Method 4:
	public static List<String> newList(List<String> myListString) {
		List<String> myList = new ArrayList<>();
		for (String string : myListString) {
			myList.add(string);
		};
		myList.set(0, myListString.get(myListString.size()-1));
		myList.set(myList.size()-1, myListString.get(0));
		return myList;
	}
	
	
	// Method 3:
	public static String shortestString(List<String> myListString) {
		String shortString = myListString.get(0);
		for(String string : myListString) {
			if (string.length() < shortString.length()) {
				shortString = string;
			};
		};
		return shortString;
	};
	
	

	

}