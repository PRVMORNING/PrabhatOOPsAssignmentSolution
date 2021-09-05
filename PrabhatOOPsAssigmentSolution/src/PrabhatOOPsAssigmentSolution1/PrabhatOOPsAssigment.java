package PrabhatOOPsAssigmentSolution1;

class SuperDepartment
{
	
	public String sd = "Super Department";
	public String nw = "No Work as of now";
	public String nil = "Nil ";
	public String tnh = "Today is not a holiday";
	
	public String ad = "Admin Department ";
	public String eod = "Complete by EOD  ";
	
	public String cs = "Complete your documents Submission";
	public String hr = "Hr Department ";
	public String atdnc = "Fill today’s worksheet and mark your attendance";
	public String tl = "team Lunch";
	
	public String td = "Tech Department ";
	public String ccm = "Complete coding of module 1";
	public String cj = "core Java";


	String  departmentName()
	{
		return sd;
	}
	 
	 String  getTodaysWork()
		{
			return nw;
		}
	 
	 String  getWorkDeadline()
		{
			return nil;
		}
	 

	 String  isTodayAHoliday()
		{
			return tnh;
		}
}

class AdminDepartment extends SuperDepartment
{  
	String  departmentName()
	{
		return ad;
	}
	 
	 String  getTodaysWork()
		{
			return cs;
		}
	 
	 String  getWorkDeadline()
		{
			return eod;
		}
}

class HrDepartment extends SuperDepartment
{
	String  departmentName()
	{
		return hr;
	}
	 
	 String  getTodaysWork()
		{
			return atdnc;
		}
	 
	 String  getWorkDeadline()
		{
			return eod;
		}
	 

	 String  doActivity()
		{
			return tl;
		}
}

class Techdepartment  extends SuperDepartment
{

	String  departmentName()
	{
		return td;
	}
	 
	 String  getTodaysWork()
		{
			return ccm;
		}
	 
	 String  getWorkDeadline()
		{
			return eod;
		}
	 

	 String  getTechStackInformation()
		{
			return cj;
		}
}



public class PrabhatOOPsAssigment 
{
public static void main(String[]args) 
{
	//SuperDepartment displaySd = new SuperDepartment();
	AdminDepartment displayAd = new AdminDepartment();
	HrDepartment displayHr = new HrDepartment();
	Techdepartment displayTd = new Techdepartment();
	
	System.out.println("Welcome to "+displayAd.departmentName());
	System.out.println(displayAd.getTodaysWork());
	System.out.println(displayAd.getWorkDeadline());
	System.out.println(displayAd.isTodayAHoliday());
	System.out.println("\n ");
	
	System.out.println("Welcome to "+displayHr.departmentName());
	System.out.println(displayHr.doActivity());
	System.out.println(displayHr.getTodaysWork());
	System.out.println(displayHr.getWorkDeadline());
	System.out.println(displayHr.isTodayAHoliday());
	System.out.println("\n ");
	
	System.out.println("Welcome to "+displayTd.departmentName());
	System.out.println(displayTd.getTodaysWork());
	System.out.println(displayTd.getWorkDeadline());
	System.out.println(displayTd.getTechStackInformation());
	System.out.println(displayTd.isTodayAHoliday());
 }
}

