package com;

public class Student {

	private int rollNo;
	private String name;
	private double marks;
	public Student(int rollNo, String name, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public double getMarks() {
		return marks;
		}

		public void setMarks(double marks) {
		this.marks = marks;
		}

		public int getRollNo() {
		return rollNo;
		}

		public String getName() {
		return name;
		}

}
