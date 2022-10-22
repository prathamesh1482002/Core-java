/*
 Author :Prathamesh Manjrekar
 Date :13 Oct 2022
 */
package labcode;
public class UserDef_Excep 
{	
public static void main (String args[])                //using main method
{
	try                                                //using try catch
	{
	int a1 =30/0;
	}
	catch(Exception e)
	{
	System.out.println("Zero can't divide any number");
	}
	System.out.println("Thank you..");
	}
}