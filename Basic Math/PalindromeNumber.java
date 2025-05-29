import java.util.Scanner;
public class PalindromeNumer{

 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();
    if(palindrome(n)){
        System.out.print("It is a palindrom Number");
    }else{
        System.out.println("It is not a palindrome Number");
    }
 }   

public static boolean palindrome(int n){
    int num1 = n;
    int num2 = 0;
    
    while(n > 0){
        int temp = n%10;
        num2 = num2 * 10 + temp;
        n = n/10;
    }
    System.out.println(num1 + " " + num2);
    return num1 == num2;
}

}