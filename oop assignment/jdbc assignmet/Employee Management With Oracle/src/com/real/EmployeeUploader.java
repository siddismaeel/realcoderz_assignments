package com.real;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.real.util.DBProvider;

public class EmployeeUploader {

	private static Connection con;

	public static void storeDepartmentDetails(Department department) {
		int rowsAffected = 0;
		try {
			con = DBProvider.getConnection();
			String sql = "insert into department values(?, ?, ?, ?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, department.getDepartmentId());
			st.setString(2, department.getDepartmentName());
			st.setString(3, department.getDepartmentHead());
			st.setString(4, department.getDepartmentDescription());

			rowsAffected = st.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (rowsAffected > 0)
			System.out.println("Data inserted successfully");
		else
			System.out.println("Data not inserted");

	}

	public static void storeEmployeeDetails(Employee employee, String departmentName) {
		int rowsAffected = 0;
		int departmentId = 0;
		ResultSet rs = null;
		PreparedStatement st = null;
		try {
			con = DBProvider.getConnection();
			String sql = "select department_id from department where department_name = ?";
			st = con.prepareStatement(sql);

			st.setString(1, departmentName);

			rs = st.executeQuery();
			if (rs.next()) {
				departmentId = rs.getInt(1);
			} else {

				System.out.println("No Department Found For The Name: " + departmentName);
				return;
			}

			sql = "insert into employee values(?,?,?,?,?,?)";
			if (st != null)
				st.close();

			st = con.prepareStatement(sql);
			st.setString(1, employee.getEmployeeId());
			st.setString(2, employee.getEmployeeName());
			st.setString(3, employee.getAddress());
			st.setDouble(4, employee.getSalary());
			st.setLong(5, employee.getContac());
			st.setInt(6, departmentId);

			rowsAffected = st.executeUpdate();

			st.close();
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
				DBProvider.closeConnection();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		if (rowsAffected > 0)
			System.out.println("Data inserted successfully");
		else
			System.out.println("Data not inserted");
	}

	public static Employee retrieveEmployeeDetails(int id) {
		Employee emp = null;
		Department department = null;
		try {
			con = DBProvider.getConnection();
			String sql = "select * from employee where employee_id = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				String empId = rs.getInt(1) +"";
				String name = rs.getString(2);
				String address = rs.getString(3);
				double sal = rs.getDouble(4);
				long num = rs.getLong(5);

				sql = "select * from employee where employee_id =" + empId;
				st = con.prepareStatement(sql);

				rs = st.executeQuery();

				if (rs.next()) {
					int deptId = rs.getInt(1);
					String departmentName = rs.getString(2);
					String departmentHead = rs.getString(3);
					String departmentDesription = rs.getString(4);

					department = new Department(deptId, departmentName, departmentHead, departmentDesription);
				}

				emp = new Employee(empId, name, address, sal, num, department);
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}
	
	public static double calculatePF(int id)
	{
		double pfAmount = 0;
		CallableStatement st = null;
		try {
			con = DBProvider.getConnection();
			st = con.prepareCall("{call calculate_pf(?,?)}");
			st.setInt(1, id);
			st.registerOutParameter(2, Types.DOUBLE);
			st.execute();
			st.getDouble(2);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		
				try
				{
					if(st != null)
						st.close();
					DBProvider.closeConnection();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
					
				
		}

		return pfAmount;
	}
		
}
