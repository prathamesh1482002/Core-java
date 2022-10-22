/*
 Author :Prathamesh Manjrekar
 Date :13 Oct 2022
 */
package labcode;
public class String_Buffer 
{
	public static void main (String args[])            //using main method
	{
    StringBuffer b1= new StringBuffer("Gol D");
	StringBuilder b2= new StringBuilder("Prathamesh");
		
	System.out.println(b1);
	b1.insert(14, "Roger");
	b2.append("Gol D Roger");
	System.out.println(b2);
	System.out.println(b1.toString().equals(b2.toString()));
	b1.delete(1,3).reverse();
	System.out.println(b1);	
	}
}