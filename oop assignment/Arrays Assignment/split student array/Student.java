package com;
import java.util.Scanner;
class Student 
{
	private int rollNo;
	private String name;
	private double marks;
	
	public Student(int rollNo, String name, double marks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public int getRollNo()
	{
		return this.rollNo;
	}
	public String getName()
	{
		return this.name;
	}
	public double getMarks()
	{
		return this.marks;
	}
}

class StudentDemo
{
	public static void main(String[] args)
	{
		Student[] students = new Student[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<students.length; i++)
		{
			System.out.println("Enter student roll number");
			int rollNo = sc.nextInt();
			
			System.out.println("Enter student name");
			String name = sc.next();
		
			System.out.println("Enter marks");
			double marks = sc.nextDouble();
			
			students[i] = new Student(rollNo, name, marks);
		}
		System.out.println("Enter one charactor \n e for students having even marks \n o for students having odd marks");
		char ch = sc.next().charAt(0);
		Student[] splitStudents = splitStudentArray(students, ch);
		
		System.out.println("Split student list is: ");
		for(Student s: splitStudents)
		{
			if(s != null)
			{
				System.out.println("Roll number" + s.getRollNo());
				System.out.println("Name: " + s.getName());
				System.out.println("Marks: " + s.getMarks());
			}
		}
	}
	
	static Student[] splitStudentArray(Student[] students, char ch)
	{
		Student[] splitStudents = new Student[5];
		switch(ch)
		{
			case 'o':
				for(int i = 0; i< students.length; i++)
				{
					if(students[i].getMarks() % 2 != 0)
					{
						splitStudents[i] = students[i];
					}
				}
				break;
			case 'e':
				for(int i = 0; i< students.length; i++)
				{
					if(students[i].getMarks() % 2 == 0)
					{
						splitStudents[i] = students[i];
					}
				}
				break;
				
			default:
				return null;
		}
		
		return splitStudents;
	}
}