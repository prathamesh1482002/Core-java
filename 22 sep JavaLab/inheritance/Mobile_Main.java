package inheritance;
public class Mobile_Main 
{
	public static void main(String[] args)
	{
	Samsung samsung=new Samsung();
	Vivo vivo=new Vivo();
	System.out.println("Checing for Hierarchical Inheritance:");
	samsung.battery();
	samsung.display();
	System.out.println("_____________________________________");
	vivo.batteryLife();
	vivo.display();
	System.out.println("_____________________________________");
	OnePlus oneplus=new OnePlus();
	System.out.println("Checing for Multilevel Inheritance:");
	oneplus.display();
	oneplus.feature();
	oneplus.function();		
	}
}
