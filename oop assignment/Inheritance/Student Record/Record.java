import java.util.*;
interface Record
{
	 public void setRecord();
	 public void DisplayRecord();
	 public Object[] searchRecord(String course, Record... students);
}

class StudentRecord implements Record
{
	private String StudentName;
	private String studentCourseName;
	private double marks;
	static Scanner sc = new Scanner(System.in);
	
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

	public void setRecord() {
		
		
		System.out.println("Enter StudentName: ");
		this.setStudentName(sc.next());
		
		System.out.println("Enter Student Course Name: ");
		this.setStudentCourseName(sc.next());
		
		System.out.println("Enter Student Marks: ");
		this.setMarks(sc.nextDouble());
		
	}

	public void DisplayRecord() {
	
		
		
			System.out.println("StudentName: " + this.getStudentName());
			System.out.println("Student Course Name: " + this.getStudentCourseName());
			System.out.println("Student Marks: " + this.getMarks());
		
	}
	
	public Record[] searchRecord(String course, Record... students) {
		Record[] list = new Record[students.length];
	
		for(int i = 0; i< students.length; i++)
		{
			if(((StudentRecord)students[i] ).getStudentCourseName().equalsIgnoreCase(course))
			{
				list[i] = students[i];
				
			}
		}
		
		return list;
	}
	
	public static Record recordWithHighestMarks(Record[] records)
	{
		Record newRecord = records[0];
		
		for(int i = 1; i<records.length; i++)
		{
			if(((StudentRecord)newRecord).getMarks() < ((StudentRecord)records[i]).getMarks())
			{
				newRecord = records[i];
			}
		}
		
		return newRecord;
	}
	
	public static void main(String[] args)
	{
		Record[] records = new Record[6];
		
		for(int i = 0; i< records.length; i++)
		{
			records[i] = new StudentRecord();
			records[i].setRecord();
		}
		System.out.println("Enter the department name to display the students");
		String department = sc.next();
		
		Record[] sortedRecord = (Record[]) new StudentRecord().searchRecord(department, records);
		
		System.out.println("Record with highest marks: ");
		StudentRecord.recordWithHighestMarks(records).DisplayRecord();
		
		System.out.println("Records for department: " + department);
		
		for(Record record: sortedRecord)
		{
			if(record != null)
			{
				record.DisplayRecord();
			}
			
		}
	}
	
	
}