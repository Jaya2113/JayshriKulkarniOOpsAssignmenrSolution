package com.greatlearning.gradedassessment;
// Driver class
 public class Main {
	 
		public static void main(String[] args) {
		
		// object creation of SuperDepartment
			
		SuperDepartment A= new SuperDepartment();
				
		// object creation of AdminDepartment
		AdminDepartment B= new AdminDepartment();
		
		
		System.out.println("Welcome to " +B.departmentName());
		
		System.out.println(B.getTodaysWork());
		
		System.out.println(B.getWorkDeadline());
		
		System.out.println(A.isTodayAHoliday());
		
		System.out.println("\n");
		
		// object creation of HrDepartment
		HrDepartment C=new HrDepartment();
		
		System.out.println("Welcome to " +C.departmentName());
		
		System.out.println(C.doActivity());
				
		System.out.println(C.getTodaysWork());
		
		System.out.println(C.getWorkDeadline());
		
		
		System.out.println(A.isTodayAHoliday());
		
		System.out.println("\n");
		
		// object creation of TechDepartment
		TechDepartment D= new TechDepartment();
		
		System.out.println("Welcome to " +D.departmentName());
		
		System.out.println(D.getTodaysWork());
		
		System.out.println(D.getWorkDeadline());
		
		System.out.println(D.getTechStackInformation());
		
		System.out.println(A.isTodayAHoliday());
		
	}

	}


