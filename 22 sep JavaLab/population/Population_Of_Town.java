package population;
public class Population_Of_Town 
{
	public static void main(String[] args)
	{
		int x=175000;  //initial population of town at starting 
		int y=262500;  //final population of town at the end of the decade 
		int z=y-x;     //Increased Population in 10 years
		int d=50;      ////total percentage of increase in population within 10 year
		int e=d/10;    //total percentage of increase in population within year
			
		System.out.println("Increased Population in 10 years : "+z);
		
		System.out.println("Increased Percentage in 10 years : " +d+"%");
		
		System.out.println("Increased Percentage for 1 year is :"  +e+"%");
	}
}
