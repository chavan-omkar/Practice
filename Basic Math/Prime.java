import java.util.Scanner;
import java.lang.Math;

public class Prime{
    public static void main(String[] args)
    {
        long time = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int no = sc.nextInt();
        // boolean isPrime = bruteForceApproach(no);
         boolean isPrime = optimalApproach(no);
        if(isPrime){
            System.out.println(no + " is a prime number");
        }else{
            System.out.println(no + " is not a prime number");
        } 
        System.out.println("Execution time : " + (System.currentTimeMillis() - time));
        
    }

    private static boolean bruteForceApproach(int no){
        int temp = 0;

        for(int i=1;i<=no;i++){
            if(no % i == 0){
                temp ++;
            }
        }

        if(temp == 2){
            return true;
        }else{
            return false;
        }
    }

    private static boolean optimalApproach(int no){
        int temp = 0;
        for(int i =1;i<=Math.sqrt(no);i++){
            if(no % i ==0){
                temp++;

                if(i != no/i){
                temp++;
            }
            }
        }

        if(temp == 2){
            return true;
        }else{
            return false;
        }
    }


}