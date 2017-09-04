import java.util.*;
public class method
{
	public static void main ( String[]args)
	{
		int a = 10, b = 20;
		System.out.println("Sum of a and b is " +Add(a,b));
		
		String mymsg = "Hello World!";
		printMessage(mymsg);
	}
	
	public static int Add(int x, int y)
	{
		return (x+y);
	}
	
	public static void printMessage(String mymsg)
	{
		for (int i = 1;i <=5;i++)
			System.out.println(mymsg);
	}
}