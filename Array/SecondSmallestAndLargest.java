
import java.util.Arrays;

public class SecondSmallestAndLargest {

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 9};
        int n = arr.length;

        if (n == 0 || n == 1) {
            System.out.println(-1);
            System.out.println(-1);
        }

        bruteForce(arr);
        better(arr);
        optimal(arr);

    }

    /*
time complexity : o(nlogn) for sorting the array;
space complexity : o(1);
     */

    private static void bruteForce(int[] arr) {
        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        System.out.println("2nd Smallest element : " + arr[1]);
        System.out.println("2nd largest element : " + arr[arr.length - 2] + " " + (System.currentTimeMillis()-start ));
    }

    /*

        It first determines the absolute smallest and largest.
         Then, in a second pass, it searches for elements that are smaller 
         than second_small (but not the actual small) or larger than second_large 
         (but not the actual large).

         it uses 2 passes which are not exactly needed


         time complexity : o(n) here the sorting is removed so 
         reduced the time but still here the constant is more (2N) ->(N) ;
         space complexity : o(1);

     */
    private static void better(int[] arr) {
        long start = System.currentTimeMillis();
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }

            if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }

        System.out.println("2nd Small :- " + secondSmall);
        System.out.println("2nd Large :- " + secondLarge + " " + (System.currentTimeMillis()- start));
    }

/*

 In these optimized single-pass functions, 
when a new small (or large) is found, the previous small (or large) 
automatically becomes the new second_small (or second_large). 
If an element is found that is not the small (or large) but 
is smaller than second_small (or larger than second_large), 
it updates second_small (or second_large) directly.


time complexity : o(n) here it is done in single pass so the constant is much less than better case;
space complexity : o(1);
*/

    private static void optimal(int[] arr){
        long start = System.currentTimeMillis();
        if(arr.length < 2){
            System.out.println(-1);
            return;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;

        for(i =0;i<arr.length;i++){

            if(arr[i]< small){
                second_small = small;
                small = arr[i];
            }
            else if(arr[i]<second_small && arr[i] != small){
                second_small = arr[i];
            }


            if(arr[i] > large){
                second_large = large;
                large = arr[i];
            }
            else if(arr[i] > second_large && arr[i] != large){
                second_large = arr[i];
            }

        }

        System.out.println("Optimal 2nd small :- "+  second_small);
        System.out.println("optimal 2nd Large :- "+second_large + " " + (System.currentTimeMillis()-start));
    }
}
