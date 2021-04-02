
class Student {
	private Long studentId;
	private Character studentGrade;
	private Double monthlyFees;
	private Boolean isScholarshipEligible;

	public Student(Long studentId, Character studentGrade, Double monthlyFees, Boolean isScholarshipEligible) {
		super();
		this.studentId = studentId;
		this.studentGrade = studentGrade;
		this.monthlyFees = monthlyFees;
		this.isScholarshipEligible = isScholarshipEligible;
	}

	public Long getStudentId() {
		return studentId;
	}

	public Character getStudentGrade() {
		return studentGrade;
	}

	public Double getMonthlyFees() {
		return monthlyFees;
	}

	public Boolean getIsScholarshipEligible() {
		return isScholarshipEligible;
	}

	public static void calculateFeesStructure(Student student) {
		double fees = 0.0;
		int exemption = 0;
		if (student.getStudentId() == 0 || !student.getIsScholarshipEligible()) {
			System.out.println("Not Eligible for Exemption");
			return;
		}

		switch (student.getStudentGrade()) {
		case 'A':
			exemption = 10;
			fees = student.getMonthlyFees() - student.getMonthlyFees() * exemption / 100;
			break;
		case 'B':
			exemption = 8;
			fees = student.getMonthlyFees() - student.getMonthlyFees() * exemption / 100;
			break;
		case 'C':
			exemption = 6;
			fees = student.getMonthlyFees() - student.getMonthlyFees() * exemption / 100;
			break;
		case 'D':
			exemption = 4;
			fees = student.getMonthlyFees() - student.getMonthlyFees() * exemption / 100;
			break;
		default:
			System.out.println("Not Eligible for Exemption");
		}

		if (fees > 0)
			System.out.println(exemption + "% of fees is exempted, the calculated fees is " + Math.round(fees));

	}

	public static void main(String[] args) {
		Student student1 = new Student(234l, 'C', 600.00, true);
		Student student2 = new Student(115l, 'B', 909.50, true);
		Student student3 = new Student(980l, 'G', 1810.00, false);
		
		Student.calculateFeesStructure(student1);
		Student.calculateFeesStructure(student2);
		Student.calculateFeesStructure(student3);
	}

}
