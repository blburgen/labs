package week05;

public class Card {
	
	private String name;
	private String suit;
	private int value;
	
	Card(String name, String suit) {
		this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		this.suit = suit.substring(0, 1).toUpperCase() + suit.substring(1).toLowerCase();
		toValue(name);
	};
	
	public void Describe() {
		System.out.println(name + " of " + suit + ": " + value + "points");
	};
	
	private void toValue(String name) {
		switch(name.toLowerCase()) {
		case("two"):
			this.value = 2;
			break;
		case("three"):
			this.value = 3;
			break;
		case("four"):
			this.value = 4;
			break;
		case("five"):
			this.value = 5;
			break;
		case("six"):
			this.value = 6;
			break;
		case("seven"):
			this.value = 7;
			break;
		case("eight"):
			this.value = 8;
			break;
		case("nine"):
			this.value = 9;
			break;
		case("ten"):
			this.value = 10;
			break;
		case("jack"):
			this.value = 11;
			break;
		case("queen"):
			this.value = 12;
			break;
		case("king"):
			this.value = 13;
			break;
		case("ace"):
			this.value = 14;
			break;
		default:
			System.out.println("Invalid entry");
		}
	};
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		toValue(name);
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit.substring(0, 1).toUpperCase() + suit.substring(1).toLowerCase();
	}
	public int getValue() {
		return value;
	}
	
}
