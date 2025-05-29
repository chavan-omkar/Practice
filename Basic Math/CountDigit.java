import java.util.Scanner;
import java.lang.Math;
public class CountDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
       
        // int digitCount = digitCount(n);
        int digitCount = optimalDigitCount(n);
        System.out.println("Number of digits : " + digitCount);
    }

    //brute force approach
    private static int digitCount(int n){
        int counter =0;
        while(n!=0){
            counter++;
            n = n/10;
        }
        return counter;
    }

    /*
    optimal approach
    
    1) The logarithmic base 10 of a positive integers gives the number 
       of digits in n. We add 1 to the result to ensure that the count 
       is correct even for numbers that are powers of 10.
    2) We cast the result to an integer to ensure that any fractional 
       part is discarded giving the exact count of digits.

        The expression (int)(Math.log10(n) + 1)
        calculates the number of digits in 'n'
        and casts it to an integer.

        Adding 1 to the result accounts
        for the case when 'n' is a power of 10,
        ensuring that the count is correct.

        Finally, the result is cast
        to an integer to ensure it is rounded
        down to the nearest whole number.

        Return the count of digits in 'n'.

    */

   private static int optimalDigitCount(int n){
    int count =0;
     count = (int) Math.log10(n)+1;
     return count;
   }
    
}