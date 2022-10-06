package oops;
/*
Author : Prathamesh Manjrekar
Date   : 06 Oct 2022
*/
public class Person_main 
{
	// Calling Main method
public static void main(String[] args)
{	
	Student stud=new Student();
	//passing parameters
	stud.pname("Prathamesh Manjrekar");   
	stud.pid(148);
	stud.marks(98);
	System.out.println();
	Employee emp=new Employee();
	//passing parameters
	emp.pname("Tushar Nair");
	emp.pid(878);
	emp.salary(90000);	
}
}
