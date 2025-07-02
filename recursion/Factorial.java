import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n = sc.nextInt();

        System.out.println("Factorial Of Given No is : "+ printFactorial(n));

    }

    private static int printFactorial(int n){
        if(n<=0){
            return 1;
        }

        return n * printFactorial(--n);
    }
}