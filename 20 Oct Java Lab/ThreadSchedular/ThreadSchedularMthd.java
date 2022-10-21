/*
Author : Prathamesh Manjrekar
Date   : 20 Oct 2022
*/
package labques;
public class ThreadSchedularMthd extends Thread 
{
	public void run()
	{ 
	 for(int i=1; i<=100; i++)
	{ 
	 try
	{
	Thread.sleep(40);
	}
	catch(InterruptedException e)
	{
	System.out.println(e);
	} 
	 System.out.println(i); 
	} 
	} 
public static void main(String args[])throws InterruptedException 
{
	ThreadSchedularMthd tm1 = new ThreadSchedularMthd();
    ThreadSchedularMthd tm2 = new ThreadSchedularMthd();
	tm1.start();
	tm1.join(40);
	tm2.start();	
}
}