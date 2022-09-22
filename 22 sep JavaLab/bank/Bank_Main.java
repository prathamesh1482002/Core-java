package bank;
/*
Author: Prathamesh Manjrekar
Date  : 22 sep
*/
public class Bank_Main 
{
	     //calling main method
        public static void main(String[] args) 
	{
		SBI sbi=new SBI();	
		sbi.managerName("Mr.Prathamesh Manjrekar");
		sbi.interest(5.6);
		System.out.println("----------------------------------------");
		Canara canara=new Canara();
		canara.managerName("Mr.Monkey D Luffy");
		canara.interest(6.6);
	}
}
