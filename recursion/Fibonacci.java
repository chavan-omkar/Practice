import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No: ");
        int n = sc.nextInt();
        // printFibonacciSeries(n);
        // lessSpaceComplexity(n);
        for(int i=0;i<n;i++){
        System.out.print(recursion(i) + " ");
        }
    }

    private static void printFibonacciSeries(int n){
        int[] fib = new int[n+1];
        if(n==0){
            System.out.println(n);
        }else{
            
            fib[0]=0;
            fib[1] =1;
            for(int i=2;i<n;i++){
                fib[i]= fib[i-1]+fib[i-2];
            }

            for(int j=0;j<fib.length-1;j++){
                System.out.print(fib[j]+" ");
            }

        }
    }


    private static void lessSpaceComplexity(int n){
        if(n==0){
            System.out.println(n);
        }
        else{
            int secondLast =0;
            int last = 1;
            int current =0;
            System.out.print(secondLast + " ");
            System.out.print(last + " ");
            for(int i=2;i<n;i++){
                current = secondLast + last;
                secondLast = last;
                last = current;
                System.out.print(current + " ");

            }
        }

    }

    private static int recursion(int n){
        if(n <= 1){
            return n;
        }
        
        int last = recursion(n-1);
        int secondLast = recursion(n-2);
        return last + secondLast;
        


    }
}