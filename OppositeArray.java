import java.util.Scanner;
public class OppositeArray {

    public static void main(String[] args) {
        int t [] [];
        int Row,Col;
        int Max=Integer.MIN_VALUE,Min=Integer.MAX_VALUE;
        int PosR=-1,PosC=-1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array: ");
        Row = scan.nextInt();
        Col = scan.nextInt();
        t = new int [Row] [Col];
        
      System.out.println("Enter the array : ");
        for(int i=0;i<Row;i++){
            for(int j=0;j<Col;j++){
                t [i] [j] = scan.nextInt();
            }
            
        }
        
        for(int i=0;i<Row;i++){
            for(int j=0;j<Col;j++){
                System.out.print(" "+t[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("The opposite array is : ");
       for(int i=0;i<Col;i++){
            for(int j=0;j<Row;j++){
                System.out.print(" "+t[j][i]);
            }
            System.out.println("");
       }

    
}
}
