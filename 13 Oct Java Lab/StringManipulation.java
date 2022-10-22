/*
 Author :Prathamesh Manjrekar
 Date :13 Oct 2022
 */
package labcode;
public class StringManipulation 
{
	public static void main(String args[])              //using main method
{
	String s1="Shanks";
	String s2="Shanks";
	String s3="Akainu";
	String s4=s1+""+s3;
	
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1.concat(s3));
	System.out.println(s1.replace(s1,s2));
	System.out.println(s1.charAt(1));
	System.out.println(s1.compareTo(s3));
	System.out.println(s1.substring(2));
	String s1[]=s3.split(" ");
	for(String s:s1)
	{
	System.out.println(s);
	}
}
}