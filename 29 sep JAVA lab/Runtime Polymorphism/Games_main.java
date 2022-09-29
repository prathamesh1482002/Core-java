/*
 * Author : Prathamesh Manjrekar
 * Date   : 29 Sep 2022
 * */
package JavaLab;
public class Games_main 
{
// calling main method 
	public static void main(String[] args) 
	{
	Games g=new Coc("Online","Multiplayer",14);          //passing runtime parameters
	 System.out.println("Clash Of Clans");
          g.type_of_game();
          g.mode_of_game();
          g.lvl_of_game();
          System.out.println();
     g=new HillClimbingRacing("Offline","Solo/Single",100);  //passing runtime parameters      
      System.out.println("Hill Climbing Racing");
          g.type_of_game();
          g.mode_of_game();
          g.lvl_of_game();
	}

}
