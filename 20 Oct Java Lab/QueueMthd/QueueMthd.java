/*
Author : Prathamesh Manjrekar
Date   : 20 Oct 2022
*/
package labques;
import java.util.LinkedList;
import java.util.Queue;
public class QueueMthd 
{
	public static void main(String[] args)
	{
	Queue <String> q1=new LinkedList<>();
	q1.add("Prathamesh");
	q1.add("Ayanakoji");
	q1.add("Riya");
	q1.add("Denji");
	q1.peek();
	q1.remove("Rock");
	q1.poll();
	
	System.out.println("Element of Queue"+q1);
	System.out.println("Peek of Queue" +q1.peek());
	System.out.println("Remove of Raju"+q1.remove("Ayanakoji"));
	System.out.println("Poll of "+q1.poll());
	}
}