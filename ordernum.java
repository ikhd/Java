import java.util.Scanner;
public class ordernum{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner (System.in);
	   int num1, num2 , num3, num;
	   
	System.out.print("   # Order Numbers #   \n\n Enter the number1: ");
    num1 = scan.nextInt();
	System.out.print("\n Enter the number2: ");
    num2 = scan.nextInt();
    System.out.print("\n Enter the number3: ");
    num3 = scan.nextInt();
	System.out.print("\n");

    if (num1 > num2){
      num = num1;
      num1 = num2;
      num2 = num;
    }
    if (num2 > num3){
      num = num2;
      num2 = num3;
      num3 = num;
    }
    if (num1 > num2){
      num = num1;
      num1 = num2;
      num2 = num;
    }
    System.out.println("The numbers are " + num1 + " , " + num2 + " , " + num3 + " .");
  }
}