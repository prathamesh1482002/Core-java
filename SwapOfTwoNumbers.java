import java.util.Scanner;  
public class SwapOfTwoNumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);         
        System.out.print("Enter a  x: ");  
        int x=sc.nextInt(); 
        System.out.print("Enter a  y: ");  
        int y=sc.nextInt();
        System.out.print("Enter a  x: ");  
        double a=sc.nextDouble(); 
        System.out.print("Enter a  y: ");  
        double b=sc.nextDouble();
        sc.close();
        swap(x,y);
        swap(a,b);
    }
    static void swap(int x,int y)
{
int z = x; x = y; y = z; 
System.out.println("x is "+x+" y is "+y);
}
    static void swap(double x, double y)
{
double z = x; x = y; y = z; 
System.out.println("x is "+x+" y is "+y);}
}