/*
Author: Prathamesh Manjrekar
Date: 15 sep
*/
class EmployeeSalary
{
 //calling main method
public static void main(String[]args)                           //Calling main method
  {
   int a=10000;
   int emp1=11000;
   int emp2=5000;
   int z=3*a;                                                      // to calculate total weekly salary of employees  
     System.out.println("Total weekly salary of employees:"+z);	
   int twoEmpSalary=emp1+emp2;
     System.out.println("Total weekly salary of Two employees:"+twoEmpSalary);       
     System.out.print("Salary of the third Employee is :"+(z-twoEmpSalary));    // salary of 3rd Employee
   }
}