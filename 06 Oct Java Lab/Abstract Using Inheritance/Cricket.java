package oops;

public class Cricket extends Game
{
	@Override
	void players() 
	{
		System.out.println("It requires 11 players in each team ");		
	}
	@Override
	void jersey() 
	{
		System.out.println("Same color of jersey required for a team ");	
	}
	@Override
	void skills()
	{
		System.out.println("Physcial fitness and athleticism reuired most");
	}
}
