import java.util.*;
public class methodsum
{
	public static void main ( String[]args)
	{
	System.out.println("Sum from 1 to 10 is:\t" +Add(1,10));
	
	System.out.println("Sum from 20 to 30 is:\t" +Add(20,30));
	
	System.out.println("Sum from 35 to 45 is:\t" +Add(35,45));
	
	}

	public static int Add (int num1, int num2)
    {
     int Add=0;
     for (int i = num1; i <= num2; i++)
     Add = Add + i;
     return Add;
 }
}