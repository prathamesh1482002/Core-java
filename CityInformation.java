/*
Author : Prathamesh Manjrekar
Date   : 13 sep 2022
*/
import java.util.Scanner;
class CityInformation
//By using Method
{ 
   void local_info(int a)
   {
   System.out.println("Pin Code of the City is :"+a);
   }
   void local_info(int a,String b)
   {
   System.out.println("Pin Code of the City is :"+a);
   System.out.println("Pin Code of the City is :"+b);
   }
   void local_info(int a,String b,String c)
   {
   System.out.println("Pin Code of the City is :"+a);
   System.out.println("Police Station  of the City is :"+b);
   System.out.println("Name of the City is :"+c);
   }
   //calling main method
   public static void main(String arg[])  
  {
   int a;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter Your choice ");
   //Taking output from user
   a =s.nextInt();
   CityInformation d=new CityInformation();
    switch (a) 
	{
      case 1:
	    d.local_info(421301);
        System.out.println(); 
        break;		
      case 2:
	    d.local_info(421301,"Kalyan Police Station");
        System.out.println();
		break;
      case 3:
	    d.local_info(421301,"Kalyan Police Station","Kalyan");
        System.out.println();
		break;
      default:
        System.out.println("Wrong input");
    }
  } 
}