import java.util.Scanner;
class arraymaxmin
{
	public static void main (String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		    System.out.print("\n#Enter the Size for the array: ");
			int size = scan.nextInt();
			
    int[] array = new int[size];
	int max;
	int min;
	
	for (int i=0;i<array.length; i++)
	{
    System.out.print("\n##Enter the values for the array: ");
	array[i] = scan.nextInt();
	}
	
	for (int index = 0;index<array.length;index++)
	{
		    System.out.println("\nThe value on array["+index+"] is : "+array[index]);	
	}
	
	max = array[0];
	int position=0;
	for (int index=0;index<array.length;index++)
	{
		if(array[index]> max){
			max = array[index];
			position = index;
		}
	}
		System.out.println("\nThe Maximum value on array["+position+"] is : "+max);
	
	min = array[0];
	int position2=0;
	for (int index=0;index<array.length;index++)
	{
		if(array[index]< min){
			min = array[index];
			position2 = index;
		}
	}
		System.out.println("\nThe Minimum value on array["+position2+"] is : "+min);
}
}