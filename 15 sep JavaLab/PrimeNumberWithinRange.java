/*
Author: Prathamesh Manjrekar
Date: 15 sep
*/
import java.util.Scanner;
class PrimeNumberWithinRange
{	
  static boolean getPrimeNumber(int n)
  { 
	for(int a=2;a<=n/a;++a)                          //Check whether The Number is Prime or Not 
	{
	if(n%a==0)
	 {
	   return false;
	 }
	}
	   return true;
  }
  
public static void main(String[] args)               //calling main method
 {
   Scanner s = new Scanner(System.in);               //Taking input from User
   System.out.println("Enter the LowerLimit of the range: ");
   int ll = s.nextInt();
   System.out.println("Enter the UpperLimit of the range: ");
   int ul = s.nextInt();
   System.out.println("Prime numbers Between"+ll+"To"+ul+"is:");   //Printing Prime Numbers Between Range
   System.out.println();
   for(int a=ll;a<=ul;a++) 
   {
    if(getPrimeNumber(a))
   {
    System.out.println(a);
   }
   }
  }
}