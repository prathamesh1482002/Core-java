/*
Author : Prathamesh 
Date   : 07 sep 2022
*/
import java.util.Scanner;
class FactorialOfNumber
{
	static void getFactors()	
   {
      // initializing the variables   
      int i, a=1, b;
      System.out.println("Enter a no.:");
      Scanner s = new Scanner(System.in);
      b = s.nextInt();
      for(i = 1; i<=b; i++)
		 {
            a = a * i;			
         }
         System.out.println("Factorial of the given number is:: "+a);
	}
	//calling main method
	public static void main(String []args)
	{
        FactorialOfNumber.getFactors();   	
 	}
}