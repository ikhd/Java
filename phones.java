import java.util.Scanner;
import java.text.DecimalFormat;
class phones{
   public static void main (String[] args){
	   System.out.println("Info for 1st Quarter:");
	   
	   Scanner scan = new Scanner (System.in);
	   System.out.print("Please enter the number of iPhones you sold: ");
	   int iph = scan.nextInt();
	   
	   System.out.print("Please enter the number of Galaxies you sold: ");
	   int Gal = scan.nextInt();

	   System.out.print("Please enter the number of Xperias you sold: ");
	   int xpe = scan.nextInt();
	   
	   System.out.println("Info for 2nd Quarter:");

	   System.out.print("Please enter the number of iPhones you sold: ");
	   int iph2 = scan.nextInt();
	   
	   System.out.print("Please enter the number of Galaxies you sold: ");
	   int Gal2 = scan.nextInt();

	   System.out.print("Please enter the number of Xperias you sold: ");
	   int xpe2 = scan.nextInt();

	   System.out.println("Info for 3rd Quarter:");

	   System.out.print("Please enter the number of iPhones you sold: ");
	   int iph3 = scan.nextInt();
	   
	   System.out.print("Please enter the number of Galaxies you sold: ");
	   int Gal3 = scan.nextInt();

	   System.out.print("Please enter the number of Xperias you sold: ");
	   int xpe3 = scan.nextInt();

	   System.out.println("Info for 4th Quarter:");

	   System.out.print("Please enter the number of iPhones you sold: ");
	   int iph4 = scan.nextInt();
	   
	   System.out.print("Please enter the number of Galaxies you sold: ");
	   int Gal4 = scan.nextInt();

	   System.out.print("Please enter the number of Xperias you sold: ");
	   int xpe4 = scan.nextInt();
	   
	   System.out.println("---------------------------------------------------");
	   int tot1 = ( iph * 2466 ); // Price per iPhone
	   int tot2 = ( Gal * 4934 ); // Price per Galaxy
	   int tot3 = ( xpe * 4934 ); // Price per Xperia
	   int tot4 = ( tot1 + tot2 + tot3); // total
	   System.out.println("Total sale for 1st Quarter =   |" + tot4 + "|");
	   
	   int tot11 = ( iph2 * 2370 ); // Price per iPhone
	   int tot22 = ( Gal2 * 3556 ); // Price per Galaxy
	   int tot33 = ( xpe2 * 10667 ); // Price per Xperia
	   int tot44 = ( tot11 + tot22 + tot33); // total
	   System.out.println("Total sale for 2nd Quarter =   |" + tot44 + "|");
	   
	   double tot111 = ( iph3 * 29566.66666666667 ); // Price per iPhone
	   double tot222 = ( Gal3 * 16895.2380952381 ); // Price per Galaxy
	   double tot333 = ( xpe3 * 1206.802721088435 ); // Price per Xperia
	   double tot444 = ( tot111 + tot222 + tot333); // total
	   DecimalFormat t123 = new DecimalFormat("###.##");
	   System.out.println("Total sale for 3rd Quarter =   |" + t123.format(tot444) + "|");
	   
	   int tot1111 = ( iph4 * 1766 ); // Price per iPhone
	   int tot2222 = ( Gal4 * 7066 ); // Price per Galaxy
	   int tot3333 = ( xpe4 * 14140 ); // Price per Xperia
	   int tot4444 = ( tot1111 + tot2222 + tot3333); // total
	   System.out.println("Total sale for 4th Quarter =   |" + tot4444 + "|");
	   System.out.println("---------------------------------------------------");
	   
	   double all = (tot4 + tot44 + tot444 + tot4444);
	   DecimalFormat tall = new DecimalFormat("###.##");
	   System.out.println("Total sale for the year is:    |" + tall.format(all) + "|");



   }
}