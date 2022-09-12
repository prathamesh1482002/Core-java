/*
Author : Prathamesh 
Date   : 12 sep 2022
*/
import java.util.Scanner;  
class SumOfDigits  
{  
   public static void main(String arg[])        //Calling Main method
 {	
    int a,b;                                    //initializing variables
    Scanner s=new Scanner(System.in);  
    System.out.println("Enter a Digit: ");   
    a=s.nextInt();                              //Taking input from the user    
    for(b=0;a!=0;a=a/10)  
        {  
	      b = b+a%10;  
        }    
    System.out.println("Sum of the Number is= "+b);  //Sum of the Digits of the Number is 
  }  
}  