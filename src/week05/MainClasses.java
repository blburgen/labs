package week05;

public class MainClasses {

	public static void main(String[] args) {
		
		//StringBuilder name = new StringBuilder();
		//StringBuilder name2 = new StringBuilder();
		
		Student student1 = new Student();
		student1.setFirstName("Tom");
		student1.setLastName("Smith");
		student1.setGradeLevel(12);
		student1.setPhoneNumber("400-123-4567");
		
		student1.introduce();
		
		Student student2 = new Student("Sammy","Jones");
		student2.introduce();
		
		Student student3 = new Student("Tom","Riddle","904-320-9876",11);
		student3.introduce();
	}

}
