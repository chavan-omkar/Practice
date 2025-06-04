import java.util.Scanner;
import java.lang.Math;

public class Armstrong{
    public static void main(String[] args){
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
         int digitCount = String.valueOf(num1).length();
         int temp = num1;
         int finalNum =0;
         // int digitCount = Math.log10(num1) + 1;

         while(num1 > 0){
            
            finalNum = finalNum + (int) Math.pow( (num1 % 10),digitCount);
            num1 = num1/10;
         }

if(temp == finalNum){
    System.out.println("The given number " + temp + " is an armstrong number");
}else{
        System.out.println("The given number " + temp + " is not an armstrong number");

}


            }
}