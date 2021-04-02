package com.real.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.real.exception.LowSalException;
import com.real.util.DBProvider;

public class Employee {
	private Scanner sc = new Scanner(System.in);
	static Connection con;
	static Map<Integer, Double> salaryMap = new HashMap<>();
	private int empId;
	private String emoName;
	private String designation;
	private double basic;
	private double hra;

	public void acceptInput() throws LowSalException {

		System.out.println("Enter id: ");
		this.empId = sc.nextInt();
		System.out.println("Enter name: ");
		this.emoName = sc.next();
		System.out.println("Enter designation: ");
		this.designation = sc.next();

		System.out.println("Enter basic salary: ");
		this.basic = sc.nextDouble();

	}

	public void storeDatabase() {

		String query = "insert into employee values(?,?,?,?,?)";
		PreparedStatement st = null;
		try {

			if (this.getBasic() < 500)
				throw new LowSalException(basic, "Salary should not be less than 500 and given salary is: ");

			con = DBProvider.getConnection();

			st = con.prepareStatement(query);
			st.setInt(1, this.getEmpId());
			st.setString(2, this.emoName);
			st.setString(3, this.designation);
			st.setDouble(4, this.basic);
			st.setDouble(5, this.hra);

			int executeUpdate = st.executeUpdate();
			if (executeUpdate > 0)
				System.out.println("update successfully!");

			st.close();
			DBProvider.closeConnection();

		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void retriveFromDatabase(int id) {

		String sql = "select * from employee where emp_id = ?";
		try {
			con = DBProvider.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);

			ResultSet rs = st.executeQuery();
			System.out.println("Result set" + rs);
			while (rs.next()) {
				this.empId = rs.getInt(1);
				this.emoName = rs.getString(2);
				this.designation = rs.getString(3);
				this.basic = rs.getDouble(4);
				this.hra = rs.getDouble(5);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void calculateHra() {

		switch (this.designation) {
		case "Manager":
			this.hra = this.basic * 10 / 100;
			break;
		case "Officer":
			this.hra = this.basic * 12 / 100;
			break;
		case "CLERK":
			this.hra = this.basic * 5 / 100;
			break;
		default:
			this.hra = 0.0;

		}
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmoName() {
		return emoName;
	}

	public String getDesignation() {
		return designation;
	}

	public double getBasic() {
		return basic;
	}

	public double getHra() {
		return hra;
	}

	/*
	 * The objectives of this method is to return the employee with highest salary +
	 * HRA to the client code
	 */
	public static String employeeNameWithHighestSalary() {
		Map<Integer, Double> empMap = getSalarayOfAll();
		if(empMap.size() == 0)
			return "No data found!";
		
		Set<Entry<Integer, Double>> entrySet = empMap.entrySet();
		Iterator<Entry<Integer, Double>> iterator = entrySet.iterator();

		Map.Entry<Integer, Double> highestEntry = iterator.next();

		while (iterator.hasNext()) {
			Map.Entry<Integer, Double> nextEntry = iterator.next();
			if (highestEntry.getValue() < nextEntry.getValue()) {
				highestEntry = nextEntry;
			}

		}


		return getEmployeeNameWithHighestSalaray(highestEntry.getKey());
	}

	private static String getEmployeeNameWithHighestSalaray(int id)
	{
		String name = "Employee name with highest salary: ";
		String sql = "select emp_name from employee where emp_id =" + id;
		try {
			con = DBProvider.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			

			ResultSet rs = st.executeQuery();
			System.out.println("Result set" + rs);
			if(rs.next())
			{
				name = rs.getString(1);
			}
			else
			{
				name = "No data found!";
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return name;
	}
	/*
	 * Method is to retrieve all emp_ids, basic salaries and HRA from database
	 */
	private static Map<Integer, Double> getSalarayOfAll() {
		String sql = "select emp_id, basic, hra from employee";

		try {

			con = DBProvider.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				salaryMap.put(rs.getInt(1), rs.getDouble(1) + rs.getDouble(2));
			}
			rs.close();
			st.close();
			DBProvider.closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return salaryMap;
	}

}
