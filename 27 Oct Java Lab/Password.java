/*
 Author :Prathamesh Manjrekar
 Date :27 Oct 2022
*/
package labcode;
import java.io.Console;
public class Password 
{
public static void main(String[] args)       // Calling main method
{
	Console c= System.console();
	System.out.println("Enter a password: ");
	char[] ch=c.readPassword();
	String pass=String.valueOf(ch);
	System.out.println("Your password is:"+pass);	
}	
}