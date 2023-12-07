package com.greatlearning.app;
import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;
public class DriverApp {
	public static void main(String[] args) {
		EmployeeServiceImpl empImpl=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your First name:");
		String fname=sc.next();
		System.out.println("Please enter your Last name:");
		String lname=sc.next();
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("Please choose department");
		int choice=sc.nextInt();
		String genEmail="";
		String genPassword="";
		switch(choice)
		{
			case 1: genEmail=empImpl.generateEmailId(fname.toLowerCase(),lname.toLowerCase(),"tech");
					break;
			case 2: genEmail=empImpl.generateEmailId(fname.toLowerCase(),lname.toLowerCase(),"admin");
					break;
			case 3: genEmail=empImpl.generateEmailId(fname.toLowerCase(),lname.toLowerCase(),"hr");
					break;
			case 4: genEmail=empImpl.generateEmailId(fname.toLowerCase(),lname.toLowerCase(),"legal");
					break;
			default: System.out.println("Please enter valid input");
		}
		genPassword=empImpl.generatePassword();
		Employee e1=new Employee();
		e1.setFname(fname);
		e1.setLname(lname);
		e1.setEmail(genEmail);
		e1.setPassword(genPassword);
		empImpl.showEmployeeDetails(e1);
	}
}
