package oops;
/*
Author : Prathamesh Manjrekar
Date   : 06 Oct 2022
*/
public class Bank_main 
{
   // Calling Main method
public static void main(String[] args) 
	{
		Bank b1=new SBI();
		b1.interest();
		Bank b2=new Axis();
		b2.interest();
		Bank b3=new ICICI();
		b3.interest();
	}
}
