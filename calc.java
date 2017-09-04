import java.util.Scanner;

public class calc{

    public static void main(String args[]) {
        int x, y, z;

		System.out.println("1 = +");
        System.out.println("2 = -");
        System.out.println("3 = /");
        System.out.println("4 = *");

        System.out.print("Enter your choice: ");
        Scanner scan = new Scanner(System.in);
        z = scan.nextInt();
		
        System.out.print("Enter first number: ");
        x = scan.nextInt();
		
        System.out.print("Enter second number: ");
        y = scan.nextInt();
        calc(x, y, z);
    }

    public static void calc(int x, int y, int z) {
        int c;

        switch (z) {
            case 1:
                c = x + y;
                System.out.print("The total is: " + c);
                break;

            case 2:
                c = x - y;
                System.out.print("The total is: "+ c);
                break;

            case 3:
                c = x / y;
                System.out.print("The total is: " + c);
                break;

            case 4:
                c = x * y;
                System.out.print("The total is: " + c);
                break;
				
				default:
            System.out.println("Error you should select a right number");
        }
    }
}