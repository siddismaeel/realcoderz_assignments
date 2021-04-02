package com;

import java.util.Scanner;

public class StudentRecord implements Record {

	private String StudentName;
	private String studentCourseName;
	private double marks;

	@Override
	public void setRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StudentName: ");
		this.setStudentName(sc.next());

		System.out.println("Enter Student Course Name: ");
		this.setStudentCourseName(sc.next());

		System.out.println("Enter Student Marks: ");
		this.setMarks(sc.nextDouble());
	}

	@Override
	public void DisplayRecord() {
		System.out.println("StudentName: " + this.getStudentName());
		System.out.println("Student Course Name: " + this.getStudentCourseName());
		System.out.println("Student Marks: " + this.getMarks());

	}

	@Override
	public Object[] searchRecord(String course, Record... students) {
		Record[] list = new Record[students.length];

		for (int i = 0; i < students.length; i++) {
			if (((StudentRecord) students[i]).getStudentCourseName().equalsIgnoreCase(course)) {
				list[i] = students[i];

			}
		}

		return list;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentCourseName() {
		return studentCourseName;
	}

	public void setStudentCourseName(String studentCourseName) {
		this.studentCourseName = studentCourseName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public static Record recordWithHighestMarks(Record[] records) {
		Record newRecord = records[0];

		for (int i = 1; i < records.length; i++) {
			if (((StudentRecord) newRecord).getMarks() < ((StudentRecord) records[i]).getMarks()) {
				newRecord = records[i];
			}
		}

		return newRecord;
	}

}
