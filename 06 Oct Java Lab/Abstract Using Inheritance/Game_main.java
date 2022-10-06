package oops;

public class Game_main 
{
	public static void main(String[] args) 
	{
		System.out.println("Cricket");
        Game g1=new Cricket();
        g1.players();
        g1.jersey();
        g1.skills();
        System.out.println();
        System.out.println("Chess");
        Game g2=new Chess();
        g2.players();
        g2.jersey();
        g2.skills();
		
	}
}
