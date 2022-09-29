/*
 * Author : Prathamesh Manjrekar
 * Date   : 29 Sep 2022
 * */
package JavaLab;
import java.util.Scanner;
public class PalindromeOrNot 
{
	//calling main method 
	public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter a String value: ");
		String s = sc.nextLine();                         //taking user input
		sc.close();
		String rev = "";
		for (int i=s.length()-1;i>=0;i--)                 //Checking String Palindrome or not by using for loophi
			
	    rev=rev+s.charAt(i);
		
		if(s.equals(rev))
			System.out.println(s+" String is palindrome");
		else 
			System.out.println(s+" String is not palindrome");
	}
}
