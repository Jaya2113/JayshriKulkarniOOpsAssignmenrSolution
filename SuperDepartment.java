package com.greatlearning.gradedassessment;


// This program uses inheritance to extend Super department
 class SuperDepartment {
	  public String department="Super Department";
	  public String Todaywork="No work as of now";
	  public String workdeadline="Nil";
	  public String holiday="Today is not a holiday";
	
//method of departmentName		
	public String departmentName()
	{
		return department;
	}
	
	//method of getTodaysWork
	public String getTodaysWork()
	{
		return Todaywork ;
	}
	//method of getWorkDeadline
	public String getWorkDeadline()
	{
		return workdeadline ;
	}
	
	//method of isTodayAHoliday
	
	public String isTodayAHoliday()
			
	{
		return holiday ;
		
	}
}
 	// The subclass of SuperDepartment
	   class AdminDepartment extends SuperDepartment
	   {
		    String department="Admin Department";
			 String Todaywork="Complete Your Document Submission";
			   String workdeadline="Complete By EOD";
			  
			 //method of departmentName	
		    public String departmentName()
		          {
			return department;
		          }
		  //method of getWorkDeadline
		
		public String getTodaysWork()
		{
			return Todaywork;
		}
		
		//method of getWorkDeadline
		public String getWorkDeadline()
		{
			return workdeadline;
		}
	}
		// The subclass of SuperDepartment
	  class HrDepartment extends SuperDepartment 
	  {
		  
		   String department="Hr Department";
			  String Todaywork="Fill today's timesheet and mark your attendance";
			   String workdeadline="Complete By EOD";
			   String act="team Lunch";
			 
		   		
		public String departmentName()
		{
			return department;
		}
		
		public String getTodaysWork()
		{
			return Todaywork;
		}
		
		public String getWorkDeadline()
		{
			return workdeadline ;
		}
		public String doActivity()
		{
				 
			return act;
			
		 }
		
	}
		
	  // The subclass of SuperDepartment
  class TechDepartment extends SuperDepartment
  { 
	  String department="Tech Department";
		  String Todaywork="complete coding of module 1";
		  String workdeadline="Complete By EOD";
		  String activity="team Lunch";
		   String stackinformation="core java";
	  
		
		public  String departmentName()
		{
			return "Tech Department";
		}
		
		public String getTodaysWork()
		{
			return Todaywork;
		}
		
		public String getWorkDeadline()
		{
			return workdeadline;
		}
		
		public String getTechStackInformation()
				 {
			return stackinformation;
				 }
	}

