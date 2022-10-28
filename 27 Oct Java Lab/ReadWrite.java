/*
 Author :Prathamesh Manjrekar
 Date :27 Oct 2022
*/
package labcode;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReadWrite 
{	
 public static void main (String[] args) throws IOException          // Calling main method
{		
	FileWriter fw1= new FileWriter("c:readwrite.txt");
	fw1.write("Welcome to the java code-");
	fw1.close();		
	FileReader fr1 = new FileReader("c:readwrite.txt");
	int data= fr1.read();	
   	  while(data!= -1)                                         //using while loop
	  {
	   System.out.print((char)data);
	   data= fr1.read();
	  }
	fr1.close();
}
}