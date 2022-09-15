/*
Author: Prathamesh Manjrekar
Date: 15 sep
*/
class LogicalEntity
{
	String Name;
	String CompanyName;
	int Salary;

	LogicalEntity(String a,String b,int c)      //by using parameterized
	{
	  Name=a;
	  CompanyName =b;
	  Salary=c;	
	}
	
	void displayData()
	{
	System.out.println("Name:"+Name);
	System.out.println("Company Name:"+CompanyName);
	System.out.println("Salary:"+Salary);
	}
	public static void main(String[] args)             //calling main method
	{
		//Passing Paramters
	 LogicalEntity d1=new LogicalEntity("Prathamesh Manjreakr","Google",900000);
	 LogicalEntity d2=new LogicalEntity("Harsh Sharma","Amazon",900000);
	 LogicalEntity d3=new LogicalEntity("Milan Dubey","Bajaj",900000);
	 LogicalEntity d4=new LogicalEntity("Neetu Joshi","Microsoft",900000);
	 LogicalEntity d5=new LogicalEntity("Rohan Gupta","Google",900000);

	 d1.void displayData();
	 d2.void displayData();
	 d3.void displayData();
	 d4.void displayData();
	 d5.void displayData();
	}
}