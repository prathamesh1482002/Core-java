package JavaLab;

public class HillClimbingRacing extends Games
{
	String mode;
	String type;
	int lvl;
	HillClimbingRacing(String mode,String type,int lvl)
	{
		this.mode=mode;
		this.type=type;
		this.lvl=lvl;;
	}
	void mode_of_game() {
		System.out.println("It is a "+mode+" game");		
	}
	void type_of_game() {
		System.out.println("IT is "+type+" player of game");		
	}
	void lvl_of_game() {
		System.out.println("It has "+lvl+" number of levels");	
	}
}
