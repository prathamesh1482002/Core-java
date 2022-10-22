/*
 Author :Prathamesh Manjrekar
 Date :13 Oct 2022
 */
package labcode;
public class Throw_s 
{
static void Null() throws NullPointerException 
	{
      throw new NullPointerException ("NullPointerException");
	}
public static void main(String[] args)                     //using main method   
{
	try                                                    //using try catch
	{
	  Null();
	}
	catch(NullPointerException e)
	{
	System.out.println(e);
	}
}
}
