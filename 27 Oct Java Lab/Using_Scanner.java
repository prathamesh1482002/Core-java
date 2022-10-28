/*
 Author :Prathamesh Manjrekar
 Date :27 Oct 2022
*/
package labcode;
import java.util.Scanner;
public class Using_Scanner 
{
public static void main(String[] args)          // Calling main method
{
	Scanner sc = new Scanner(System.in);	
	int i=sc.nextInt();
    System.out.println(i);
		
	String s=sc.nextLine();
	System.out.println(s);
	
	double d=sc.nextDouble();
	System.out.println(d);
		
	boolean b=sc.nextBoolean();
	System.out.println(b);		
}
}