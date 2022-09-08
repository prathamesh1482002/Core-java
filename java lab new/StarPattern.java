/*
Author : Prathamesh 
Date   : 08 sep 2022
*/
public class StarPattern
{
	//calling Main method
  public static void main(String[] args)
    {	
        int rows =2;                         //initializing the rows
			
        for (int i= 0; i<= rows-1 ; i++)
           {
            for (int j=0; j <i; j++)
           {
                System.out.print(" ");
           }
            for (int k=i; k<=rows-1; k++)
           {
                System.out.print("* " + " ");
           }
                System.out.println("");
           }
            for (int i= rows-1; i>= 0; i--)
           {
            for (int j=0; j < i ;j++)
           {
                System.out.print(" ");
           }
            for (int k=i; k<=rows-1; k++)
           {
                System.out.print("* " + " ");
           }
                System.out.println("");
           }
    }
}