/*
 Author :Prathamesh Manjrekar
 Date :13 Oct 2022
 */
package labcode;
public class ExceptionNest
{
public static void main (String args[])                  //using main method
{     
	try                                                  //using exception Handling 
	{                                                    //using nested try catch
	try
	{
		String a=null;
		System.out.println(a.length());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	try
	{
		int [] b= {1,2,3,4,5};
        System.out.println(b[5]);		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}