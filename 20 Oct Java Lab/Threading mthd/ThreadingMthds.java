/*
Author : Prathamesh Manjrekar
Date   : 20 Oct 2022
*/
package labques;
public class ThreadingMthds extends Thread
{
public void thread()
{
	System.out.println();
}
	public static void main(String[] args) 
	{	
		ThreadingMthds th1 = new ThreadingMthds();
		ThreadingMthds th2= new ThreadingMthds();
		
		System.out.println("Name of thread 1: "+th1.getName());
		System.out.println("Name of thread 2: "+th2.getName());
		
		th1.setName("Prathamesh");
		th2.setName("Vipin");
		th1.start();
		th2.start();
	
		System.out.println("After change thread 1 name :"+th1.getName());
		System.out.println("After change thread 2 name :"+th2.getName());	
	}
}
