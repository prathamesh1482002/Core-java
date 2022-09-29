package JavaLab;

public class Android_Phone_main {

	public static void main(String[] args) 
	{
		Android_Phone a1=new Android_Phone("Samsung",4,"black","Dark");
		Android_Phone a2=new Android_Phone("Apple",6,"blue","LighDark");
		Android_Phone a3=new Android_Phone("OnePlus",8,"red","Dark");
		
		Android_Phone[] arr=new Android_Phone[3];
		arr[0]=a1;
		arr[1]=a2;
		arr[2]=a3;
		
		for(Android_Phone a: arr )
		{
			System.out.println(a);
		}
	}
}
