import java.util.Scanner;
public class LargeEleArray {
    public static void main(String[] args) {
        double t [] [];
        int Row,Col;
        double Max=Integer.MIN_VALUE,Min=Integer.MAX_VALUE;
        int PosR=-1,PosC=-1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array: ");
        Row = scan.nextInt();
        Col = scan.nextInt();
        t = new double [Row] [Col];
        
        for(int i=0;i<Row;i++){
            for(int j=0;j<Col;j++){
                System.out.println("Enter the array : " + "(" + i + "," + j + ")");
                t [i] [j] = scan.nextDouble();
            }
        }
        
        for(int i=0;i<Row;i++){
            for(int j=0;j<Col;j++){
                System.out.print(" "+t[i][j]);
            }
            System.out.println("");
        }
        
        for(int i=0;i<Row;i++){
            for(int j=0;j<Col;j++){
       if(t [i] [j] > Max)
       {
           Max = t [i] [j];
           PosR = i;
           PosC = j;
       } 
    }
            
            
        }
     System.out.println("");   
     System.out.println("The location of the largest element is at " + "(" + PosR + "," + PosC + ")");
        
    }
}