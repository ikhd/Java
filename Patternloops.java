public class Patternloops
{
public static void main(String[]args)
{
System.out.println("\nPattern 1\n");     // 1  12  123 1234 12345 123456
{
for(int i=1;i<=6;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j + " ");
}
System.out.println();
}
{
System.out.print("\n--------------\n\nPattern 2\n\n"); // 123456 12345 1234 123 12 1
}
for (int x = 0; x < 6; x++)
{
for (int y = 1; y <= 6 - x; y++)
{
System.out.print(y + " ");
}
System.out.println();	
}
}
}
}