package com;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Record[] records = new Record[6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < records.length; i++) {
			records[i] = new StudentRecord();
			records[i].setRecord();
		}
		System.out.println("Enter the department name to display the students");
		String department = sc.next();

		Record[] sortedRecord = (Record[]) new StudentRecord().searchRecord(department, records);

		System.out.println("Record with highest marks: ");
		StudentRecord.recordWithHighestMarks(records).DisplayRecord();

		System.out.println("Records for department: " + department);

		for (Record record : sortedRecord) {
			if (record != null) {
				record.DisplayRecord();
			}

		}
	}
}
