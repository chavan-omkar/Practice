import java.util.Scanner;
import java.lang.Math;

public class GCD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the no2 : ");
        int n2 = sc.nextInt();
        System.out.println("GCD is : "+ bruteForceSolution(n1,n2));
        System.out.println("GCD is : " + betterSolution(n1,n2));
        System.out.println("GCD is : " + optimalSolution(n1,n2));
    }

    public static int bruteForceSolution(int n1,int n2){
        int gcd = 1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            
            }
        }
        return gcd;
    }


    public static int betterSolution(int n1,int n2){
        int gcd = 1;
        for(int i=Math.min(n1,n2);i>=1;i--){
            if(n1%i==0 && n2%i==0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static int optimalSolution(int n1,int n2){
        while(n1 > 0 && n2 >0){
            if(n1 > n2){
                n1= n1%n2;
            }else{
                n2= n2%n1;
            }

        }

        if(n1 == 0){
           return n2;
        }
        return n1;
    }
}