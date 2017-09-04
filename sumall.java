import java.util.Scanner;
public class sumall {
  	public static void main(String[] args) {
      Scanner a = new Scanner (System.in);
	  System.out.println("Enter the number: ");
	  int n = a.nextInt();
	  int count = 1;
	  int sum = 0;
	  while (count <= n)
	  {
		  sum = sum + count;
		  count = count + 1;
	  }
	  System.out.println("Sum is:" + sum );
	}
}
