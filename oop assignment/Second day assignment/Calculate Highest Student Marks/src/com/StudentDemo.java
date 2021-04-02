package com;

public class StudentDemo {

	public static void main(String[] args) {

		Student one = new Student(1, "ravi", 45);
		Student two = new Student(2, "amit", 65);
		Student three = new Student(3, "pooja", 55);

		System.out.println("Student with highest marks is " + compareStudents(one, two, three));

	}

	public static String compareStudents(Student one, Student two, Student three) {
		Student st = one;

		if (two.getMarks() > st.getMarks())
			st = two;

		if (three.getMarks() > st.getMarks())
			st = three;

		return st.getName();
	}

}
