import java.util.*;
import java.lang.Math;
public class Divisors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num1 = sc.nextInt();
        bruteForceApproach(num1);
        ArrayList<Integer> list = optimalApproach(num1);
        System.out.println();
        System.out.println("Prinitng using optimized approach");
        for(int divisor : list){
            System.out.print(divisor + " ");
        }
    }

    private static void bruteForceApproach(int num1){
        for(int i=1;i<num1;i++){
            if(num1%i ==0){
                System.out.print(i + " ");
            }
        }
    }

    private static ArrayList optimalApproach(int num1){
        int n = (int)Math.sqrt(num1);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(num1%i == 0){
                list.add(i);

                if(i != num1/i){
                    list.add((num1/i));
                }
            }
        }

        return list;
    }
}