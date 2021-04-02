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

class SorterDemo
{
	public static void main(String args[])
	{
		Student[] students = new Student[5];
		Scanner sc = new Scanner(System.in);
		double[] doubleValues = {3.50,5.05,1.87, 2.99, -7.98};
		String str = "zyxwvutsrqponmlkjihgfedcba";
		
		//initilizing student array
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
		
		double[] sortedDouble = sortDouble(doubleValues);
		for(double value: sortedDouble)
		{
			System.out.print(value + ", ");
		}
		
		String sortedStr = sortString(str);
		System.out.println("Sorted string: ");
		System.out.println(sortedStr);
		
		Student[] sortedStudents = sortStudent(students);
		System.out.println("Sorted students: ");
		
		for(Student s: students)
		{
			System.out.println("Roll number: " + s.getRollNo());
			System.out.println("Roll name: " + s.getName());
			System.out.println("Marks: " + s.getMarks());
		}
		
		
		
		
	}
	
	static double[] sortDouble(double[] values)
	{
		
		for(int i = 0; i< values.length-1; i++)
		{
			//finding the minimum value 
			int minInex = i; 
			for(int j = i+1; j<values.length; j++) 
			{
				if(values[minInex] > values[j])
				{
					minInex = j;
				}
			}
			
			double temp = values[minInex];
			values[minInex] = values[i];
			values[i] = temp;
			
		}
		
		return values;
	}
	
	static String sortString(String str)
	{
		StringBuffer str1 = new StringBuffer(str);
		
		for(int i = 0; i< str.length()-1; i++)
		{
			int minIndext = i;
			
			for(int j = i+1; j<str1.length(); j++)
			{
				if(str1.charAt(minIndext) > str1.charAt(j))
				{
					minIndext = j;
				}
			}
			
			char temp = str1.charAt(minIndext);
			str1.setCharAt(minIndext, str1.charAt(i));
			str1.setCharAt(i, temp);
			
		}
		return new String(str1);
	}
	static Student[] sortStudent(Student[] students)
	{
		for(int i = 0; i<students.length-1; i++)
		{
			int minIndext = i;
			for(int j = i+1; j<students.length; j++)
			{
				if(students[minIndext].getMarks() > students[j].getMarks())
				{
					minIndext = j;
				}
				
				Student newStudent = students[minIndext];
				students[minIndext] = students[i];
				students[i] = newStudent;
			}
			
		}
		return students;
	}
	
	
	
	
}