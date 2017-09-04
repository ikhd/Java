import java.util.Scanner;
 
public class array2dinput
{
    public static void main(String[] args) {

        double x;
        double[][] sumarray = new double[4][4];

        System.out.println("Enter a 4x4 2D:");
        Scanner input = new Scanner(System.in);
         for (int i = 0; i < sumarray.length; i++) {
             for (int j = 0; j < sumarray.length; j++) {
                 sumarray[i][j] = input.nextDouble(); 
             }
         }
		double sum=0;
		
		for(int i=0;i<sumarray.length; i++)
		{
		for(int j=0;j<sumarray.length; j++)
					{
			sum = sum + sumarray[i][j];
		}
		 
         x = +sum;

         System.out.println("The sum of the elements is " + x);

    }

}
}