import java.util.Scanner;
public class myATM{
    public static void main(String[] args)
    {
//--------------------------------------------------------------------------------- 4 digits long .. (Password) .
       Scanner input  = new Scanner(System.in);
    String pass = "";
	
    System.out.print("Welcome to ATM simulator, Please enter your password: ");
    pass = input.next();
             
    if(pass.length() == 4)
    {
      }
	  else
	  {
      System.out.print("Password must be '4-digits' long.");
	  System.exit(0);                                            // this code will end the program if you enter <4 or >4 (just add-on)

}


//--------------------------------------------------------------------------------- for deposit + withdraw + Cancel
	
        System.out.println("Please enter:");
		System.out.println(" D: for deposit");
	    System.out.println(" W: for withdraw");
		System.out.println(" C: to cancel");
		
	    String text = input.next();		

if(text.equals("d") || text.equals("D"))
{
	   System.out.print("Please enter the amount to deposit: ");
	   int dep = input.nextInt();
	   
       int tot1 = ( dep + 1000 );
	   
	   System.out.println("Your new balance = " + tot1 );
}
else if(text.equals("w") || text.equals("W"))
{
	   System.out.print("Please enter the amount to withdraw: ");
	   int wit = input.nextInt();
	   
       int tot11 = ( wit + 900 );
	   
	   System.out.println("Your new balance = " + tot11 );
}
else if(text.equals("c") || text.equals("C"))
{
       System.out.print("Your transaction has been cancelled as requested. Thank you");
}
else
{
	      System.out.print("Sorry, you have entered a wrong choice. Good bye");
	}

}
}