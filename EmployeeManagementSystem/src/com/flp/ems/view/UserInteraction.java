package com.flp.ems.view;

import java.util.*;

import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.service.IEmployeeService;
import com.flp.ems.util.validate;

public class UserInteraction {
	private String Name; 
	private String Email_id; 
	private String Address; 
	private String Date_of_birth;
	private String Date_of_Joining;
	private String Department;
	private String Project; 
	private String Roles;
	private String Phone_no;
	IEmployeeService emp;
	UserInteraction(){
		
	
	       emp=new EmployeeServiceImpl();
	}
	static Scanner UserInput = new Scanner(System.in);
	
	 HashMap<String, String> in = new HashMap<String, String>();
	 
	 validate vd = new validate();
	 
		public void AddEmployee(){
			
			
			
			System.out.println("Enter name: ");
		     Name = UserInput.next();
		     in.put("Name",Name);
			
			System.out.println("Enter Kin_Id: ");
			String Kin_Id = UserInput.next();
			in.put("Kin_Id",Kin_Id);
			
			System.out.println("Enter Email_id: ");
			String Email_id = UserInput.next();
			in.put("Email_id",Email_id);
			
			System.out.println("Enter Phone_no: ");
			String Phone_no = UserInput.next();
			in.put("Phone_no",Phone_no);
			
			System.out.println("Enter Address: ");
			String Address = UserInput.next();
			in.put("Address",Address);
			
			System.out.println("Enter Date_of_birth: ");
			String Date_of_birth = UserInput.next();
			boolean db = vd.valid_Date(Date_of_birth);
			
			
			System.out.println("Enter Date_of_Joining: ");
			String Date_of_joining = UserInput.next();
			boolean dj = vd.valid_Date(Date_of_Joining);
			
			if(db&&dj){
				
				System.out.println("Date is validated");
				in.put("Date_of_birth", Date_of_birth);
				in.put("Date_of_Joining",Date_of_Joining);
				}
			else {System.out.println("Date is invalid");}
			
		
			System.out.println("Enter Department: ");
			String Department = UserInput.next();
			in.put("Department",Department);
			
			System.out.println("Enter Project: ");
			String Project = UserInput.next();
			in.put("Project",Project);
			
			System.out.println("Enter Role: ");
			String Role = UserInput.next();
			in.put("Role",Role);
		}

		public void ModifyEmployee(){
			
		}
		public void RemoveEmployee(){
			
		}
		public void SearchEmployee(){
			
		}
		public void getAllEmployee(){
			
		}
		 
		 
	 }
	
	
