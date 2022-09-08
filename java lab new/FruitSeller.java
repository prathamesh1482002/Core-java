/*
Author : Prathamesh 
Date   : 08 sep 2022
*/
class FruitSeller
{
//calling main method
   public static void main(String[] args)
   {
      int a = 420;   //Remaining apples	  
      int b = 100-40;  //Total percent of remaining apple
      int c = a*100/b;    //Formula for calculating Total number of apple  
      System.out.println("Fruit seller had total "+c+" apples");
   }
}