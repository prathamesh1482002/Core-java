/*
 Author :Prathamesh Manjrekar
 Date :27 Oct 2022
*/
package labcode;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
public class Printwriter_Data 
{
public static void main(String[] args) throws IOException         // Calling main method
{
  FileOutputStream out = new FileOutputStream("c:.Txt");
  PrintWriter pw = new PrintWriter(out);
  pw.println("Emp name:- Prathamesh");
  pw.println("Emp id:- 14");
  pw.println("Emp sal:- 80000");	
  pw.close();
  System.out.println("Done");
}
}