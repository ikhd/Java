import java.util.Scanner;
public class oddoreven{
    public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
      int number;
	  System.out.print("   # Odd and Even number checker #   \n\n Enter the number: ");
      number = scan.nextInt();
	  
      if ( number % 2 == 0 ){
         System.out.println("You entered an even number.");
	}
      else{
         System.out.println("You entered an odd number.");
    }
}
}