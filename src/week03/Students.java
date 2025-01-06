package week03;

public class Students {

	public static void main(String[] args) {
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";

		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		String[] students =  new String[3];
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		};
		
		for (String student : students) {
			System.out.println(student);
		};
	}

}
