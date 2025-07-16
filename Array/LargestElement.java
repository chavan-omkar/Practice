
import java.util.Arrays;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 9};
        bruteForce(arr);
        iterative(arr);
    }

    /*
        time complexity :- o(nlogn);
        space complexity :- o(n)
     */
    private static void bruteForce(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }

    /*
        time complexity :- o(n);
        space complexity :- o(1)

        this is recommended as the time complexity is better 
        and regardless of the array size this will use constant space
     */
    private static void iterative(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
