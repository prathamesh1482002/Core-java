/*
Author : Prathamesh Manjrekar
Date   : 20 Oct 2022
*/
package labques;
class Number
{
	synchronized void number(int n)
	{
	for(int i=1; i<=50;i++)
	{
		System.out.println(i);
		try
		{
		Thread.sleep(60);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
	}
}
class Thread2 extends Thread
{
	Number n;
	Thread2(Number n)
	{
		this.n=n;
	}
	public void run()
	{
		n.number(8);
	}
}
class Thread3 extends Thread
{
	Number n;
	Thread3(Number n)
	{
		this.n=n;
	}
	public void run()
	{
		n.number(5);
	}
}
class ThreadSyncronization
{
public static void main(String args[])
{
	Number n = new Number();
	Thread2 th2=new Thread2(n);
	Thread3 th3 = new Thread3(n);
	th2.start();
	th3.start();
}
}