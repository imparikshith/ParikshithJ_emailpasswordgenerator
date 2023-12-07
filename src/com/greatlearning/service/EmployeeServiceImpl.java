package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.util.Random;
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public String generateEmailId(String fname, String lname, String deptname) {
		return (fname+lname+"."+deptname+"@greatlearning.com");
	}

	@Override
	public String generatePassword() {
		Random random=new Random();
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijlmnopqrstuvwxyz";
		String nums="0123456789";;
		String splchars="!@#$%^&*()";
		String combined=caps+lower+nums+splchars;
		String password="";
		for(int i=0;i<8;i++)
		{
			password+=combined.charAt(random.nextInt(combined.length()));
		}
		return password;
	}

	@Override
	public void showEmployeeDetails(Employee e) {
		System.out.println("Employee Firstname is: "+e.getFname());
		System.out.println("Employee Lastname is: "+e.getLname());
		System.out.println("Employee Email-Id is: "+e.getEmail());
		System.out.println("Employee Password is: "+e.getPassword());
	}
	
}
