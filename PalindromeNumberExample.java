public class PalindromeNumberExample {
  	public static void main(String[] args) {
      	//int number = use scanner to read the number from user
         int number=7887;
         int numbertemp=number;
  	     int reversedNumber  = 0 , temp=0;
	 while (numbertemp > 0){
  		temp = numbertemp % 10;                                  // 7   ,, 8 ( second loop) ,, 8 ( third ) ,, 7 ( fourth)
  		numbertemp = numbertemp / 10;                            // 788 ,, 78 ( second loop ) ,, 7 ( third ) ,, 0 ( fourth )
  		reversedNumber = reversedNumber * 10 + temp;   		}    // 7   ,, 78 ( second loop ) ,, 788 ( third ) ,, 7887 ( fourth)
// to check if the number is palindrome or not 
      if (number == reversedNumber)
  	 System.out.println(number + " is a palindrome number");
  	else 
  	 System.out.println(number + " is not a palindrome number");    
     }   
 }
