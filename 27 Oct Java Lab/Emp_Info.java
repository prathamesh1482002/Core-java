/*
 Author :Prathamesh Manjrekar
 Date :27 Oct 2022
*/
package labcode;
import java.io.FileWriter;
public class Emp_Info 
{	
  public static void main(String[] args)               // Calling main method
{
  try                                                 // using try catch block 
 {
   int eid=24;
   String ename="Prathamesh";
   int sal=12000;
   
   FileWriter fw1 = new FileWriter("c:Empinfo.txt");
   fw1.write("Emp id:-"+eid+"Emp name:-"+ename+"Salary:-"+sal);
   fw1.close();
 }
    catch(Exception e)
   {
	System.out.println(e);
	e.printStackTrace();
   }
}
}