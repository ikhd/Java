import java.util.*;
     class sumallop
{
	public static void main (String [] args)
	{
		int x, v ;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Number a: ");
		x = scan.nextInt();
		
		System.out.println("Number b: ");
		v = scan.nextInt();
		
		int a = x , b =v;
		
		int addresult = add(a,b);
		System.out.println("sum of a and b is" + addresult);
		
		int subresult = sub(a,b);
		System.out.println("sub of a and b is" +subresult);
	
		
		int divloberes = divlobe (a,b);
		System.out.println("divlobe of a and b is" +divloberes);
		
		int regres = reg (a,b);
		System.out.println("reg of a and b is" +regres);
		
		
		String myMessage = "Hello World!" ;
		printMessage(myMessage);
	}
	
	public static int divlobe ( int x , int y)
	{return ( x/y);}
	
	public static int add (int x , int y)
	{return (x+y);}
   
   public static int sub ( int x , int y)
	{return ( x-y);}
   
   public static int reg ( int x , int y)
	{return ( x*y);}
   
   
    public static void printMessage(String message)	
    {
	for ( int i = 1; i <=5; i++)
		System.out.println(message);
    }
	
}
	
	
