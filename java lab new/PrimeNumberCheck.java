/*
Author : Prathamesh 
Date   : 08 sep 2022
*/
import java.util.Scanner; 
public class PrimeNumberCheck 
{ 
  //calling main method 
     public static void main(String args[]) 
   { 
   // initializing variables
      int a,b,c; 
      Scanner s=new Scanner(System.in); 
      System.out.println("Input a number"); 
      a =s.nextInt(); 
      b=1; 
      c=0; 
        while(b<= a) 
      { 
        if((a%b)==0) 
        c=c+1; 
        b++; 
      } 
        if(c==2) 
         System.out.println(a +" is a prime number"); 
         else 
         System.out.println(a +" is not a prime number"); 
   } 
}