abstract class Faculty
{
	int id;
	String name;
	int age;
	double sal;
	String cource;
	public Faculty(int id, String name, int age, double sal, String cource)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.cource = cource;
	}
	public abstract Faculty search(int id, Faculty... faculties);
	
	public static int totalCountOfFacultyMembers(Faculty... faculties)
	{
		return faculties.length;
	}
	
	public static int getCountOfPermanentFaculties(Faculty... faculties)
	{
		int count = 0;
		for(Faculty faculty: faculties)
		{
			if(faculty instanceof PermanentFaculty)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int getCountOfTemporaryFaculties(Faculty... faculties)
	{
		int count = 0;
		for(Faculty faculty: faculties)
		{
			if(faculty instanceof TemporaryFaculty)
			{
				count++;
			}
		}
		return count;
	}
	
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
		
	}
	public double getSal()
	{
		return this.sal;
	}
	public String getCource()
	{
		return this.cource;
	}
}

class TemporaryFaculty extends Faculty
{
	int duration;
	
	public TemporaryFaculty(int id, String name, int age, double sal, String cource, int duration)
	{
		super(id, name, age, sal, cource);
		this.duration = duration;
	}
	
	public Faculty search(int id, Faculty... faculties)
	{
		Faculty foundFaculty = null;
		for(Faculty faculty: faculties)
		{
			if(faculty.getId() == id)
			{
				foundFaculty = faculty;
			}
		}
		
		return foundFaculty;
	}
	
	public int getDuration()
	{
		return this.duration;
	}
}

class PermanentFaculty extends Faculty
{
	double bonus;
	double hra;
	
	public PermanentFaculty(int id, String name, int age, double sal, String cource, double bonus, double hra)
	{
		super(id, name, age, sal, cource);
		this.bonus = bonus;
		this.hra = hra;
	}
	
	public Faculty search(int id, Faculty... faculties)
	{
		Faculty foundFaculty = null;
		for(Faculty faculty: faculties)
		{
			if(faculty.getId() == id)
			{
				foundFaculty = faculty;
			}
		}
		
		return foundFaculty;
	}
	public double getBonus()
	{
		return this.bonus;
	}
	public double getHra()
	{
		return this.hra;
	}
}

class Test
{
	public static void main(String[] args)
	{
			
		Faculty faculty1 = new PermanentFaculty(1, "Ismaeel", 23, 15000, "Java", 2000, 3000);
		Faculty faculty2 = new TemporaryFaculty(2, "Kashan", 22, 13000, "OS", 5);
		Faculty faculty3 = new PermanentFaculty(3, "Rakesh" , 25, 20000, "Android", 2000, 3000);
		Faculty faculty4 = new TemporaryFaculty(4, "Rehan" , 22, 14000, "PHP",5);
		Faculty faculty5 = new TemporaryFaculty(5, "Rahul" , 24, 11000, "Dot Net",7);
		
		Faculty faculty = faculty1.search(3, faculty1,faculty2,faculty3,faculty4, faculty5);
		
		if(faculty != null)
		{
			System.out.println("=================Found faculty details==========");
			System.out.println("Faculty ID: " + faculty.getId());
			System.out.println("Faculty Name: " + faculty.getName());
			System.out.println("Faculty age: " + faculty.getAge());
			System.out.println("Faculty Salary: " + faculty.getSal());
			System.out.println("Faculty Course: " + faculty.getCource());
		}
		else
		{
			System.out.println("Faculty not found");
		}
		
		System.out.println("Total faculties: " + Faculty.totalCountOfFacultyMembers(faculty1,faculty2,faculty3,faculty4, faculty5));
		System.out.println("Total permanent faculties: " + Faculty.getCountOfPermanentFaculties(faculty1,faculty2,faculty3,faculty4, faculty5));
		System.out.println("Total temporary faculties: " + Faculty.getCountOfTemporaryFaculties(faculty1,faculty2,faculty3,faculty4, faculty5));


		
		
	}
}