import java.util.Scanner;

public class Point {
    private double x,y;
    
    public Point(double xaxis,double yaxis){
        x= xaxis;
        y= yaxis;
    }
    
    public double getxaxis(){
        return x;
    }
    
    public double getyaxis(){
        return y;
    }
    
}

public class Triangle {
    
    private Point a,b,c;
    
    public Triangle(Point a,Point b,Point c)
     {
         this.a=a;
         this.b=b;
         this.c=c;
}
    
   public double getside1(){
      double side1 = Math.sqrt((b.getxaxis()-a.getxaxis()) * (b.getxaxis()-a.getxaxis()) + (b.getyaxis()-a.getyaxis()) * (b.getyaxis()-a.getyaxis()));
            
      return side1;
      
   }
   
      public double getside2(){
      double side2 = Math.sqrt((b.getxaxis()-c.getxaxis()) * (b.getxaxis()-c.getxaxis()) + (b.getyaxis()-c.getyaxis()) * (b.getyaxis()-c.getyaxis()));
      
      return side2;
      
      }
      
      public double getside3(){
      double side3 = Math.sqrt((a.getxaxis()-c.getxaxis()) * (a.getxaxis()-c.getxaxis()) + (a.getyaxis()-c.getyaxis()) * (a.getyaxis()-c.getyaxis()));
     
      return side3;
      
   }
     
    public double Perimeter(){
      double Perimeter = getside1() + getside2() + getside3();
      return Perimeter;
      
   }  
    
    public double Area(){
        double Area = Math.abs((a.getxaxis()*(b.getyaxis()-c.getyaxis())+b.getxaxis()*(c.getyaxis()-a.getyaxis())+c.getxaxis()*(a.getyaxis()-b.getyaxis()))/2);
        return Area;
    }

    
}

public class Test {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
                
        double x1 = 0 , x2= 0 , x3= 0, y1= 0, y2= 0,y3=0;
        
        System.out.println("Enter Triangle's coordinates");
           
               
       System.out.print("x1= ");
       x1 = scan.nextDouble();
       System.out.print("y1= ");
       y1 = scan.nextDouble();
       
         Point a=new Point(x1,y1);
         
       System.out.print("x2= ");
       x2 = scan.nextDouble();
       System.out.print("y2= ");
       y2 = scan.nextDouble();
       
         Point b=new Point(x2,y2);
       
       System.out.print("x3= ");
       x3 = scan.nextDouble();
       System.out.print("y3= ");
       y3 = scan.nextDouble();
       
          Point c=new Point(x3,y3);
          
       Triangle t =new Triangle(a,b,c);
       
       System.out.println("Area:" +t.Area());
       System.out.println("Perimeter:" +t.Perimeter());
    }
    
}
