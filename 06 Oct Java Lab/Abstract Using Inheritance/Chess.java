package oops;

public class Chess extends Game
{
	@Override
	void players() 
	{
		System.out.println("Only 2 player need to play this game");		
	}
	@Override
	void jersey() 
	{
		System.out.println("Formal ouftit is used while playing");	
	}
	@Override
	void skills()
	{
		System.out.println("It requires mental stablity to win");
	}
}
