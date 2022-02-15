package prob2A;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<Student> students = createStudents();
		assignGrades(students, new String[]{"A", "A+", "A", "B"});
		System.out.println("Students with their Grades: \n  " + students);
	}
	//class-level access
	private static List<Student> createStudents() {
		Student s1 = new Student("Bijay");		
		Student s2 = new Student("Shrestha");		
		Student s3 = new Student("Bishow");		
		Student s4 = new Student("Shrestha");	
		return Arrays.asList(s1, s2, s3, s4);
	}
	
	private static void assignGrades(List<Student> students, String[] grades) {
		for(int i = 0; i < grades.length; ++i) {
			students.get(i).getReport().setGrade(grades[i]);
		}
	}

}
