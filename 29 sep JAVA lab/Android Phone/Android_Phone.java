package JavaLab;

public class Android_Phone 
{
	// initializing the variables
	String phone_name;
	int ram;
	String color;
	String display;
	public Android_Phone(String phone_name,int ram,String color,String display)
	{
		this.phone_name=phone_name;
		this.ram=ram;
		this.color=color;
		this.display=display;	
	}
	
	public String toString()
	{
		return "Android_Phone [ModelName :" +phone_name+ " RAM :"+ram+"  Color Of the Device :"+color+ "  Display :"+display+"] ";
	}
}
