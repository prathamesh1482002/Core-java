/*
Author : Prathamesh Manjrekar
Date   : 20 Oct 2022
*/
package labques;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StudentInfo 
{
	public static void main(String[] args) 
{     
		List<String> StudDetail=new LinkedList<>();	
		StudDetail.add("Prathamesh ");
		StudDetail.add("Mob no:-9854125674");
		StudDetail.add("Rollno:-16");
		StudDetail.add("College name:KM AGRWAL");
		StudDetail.add("City Name:- Kalyan");
				 
		Iterator it =StudDetail.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}