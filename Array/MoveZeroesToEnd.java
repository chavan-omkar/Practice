
import java.util.ArrayList;

public class MoveZeroesToEnd {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;

        // bruteForce(arr,n);
        optimal(arr, n);
    }


        /*

            Time Complexity: O(N) + O(X) + O(N-X) ~ O(2*N), where N = total no. of elements,
            X = no. of non-zero elements, and N-X = total no. of zeros.
            Reason: O(N) for copying non-zero elements from the original to the temporary array. O(X) for again copying it back from the temporary to the original array. O(N-X) for filling zeros in the original array. So, the total time complexity will be O(2*N).

            Space Complexity: O(N), as we are using a temporary array to solve this problem and the maximum size of the array can be N in the worst case.
            Reason: The temporary array stores the non-zero elements. In the worst case, all the given array elements will be non-zero.



        */

    private static void bruteForce(int[] arr,int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                // temp[i] = arr[i];
                temp.add(arr[i]);
            }
        }

        int j = temp.size();
        for (int i = 0; i < j; i++) {
            arr[i] = temp.get(i);
        }

        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }
        System.out.println("After Moving all zeroes to end");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    /*

        Time Complexity: O(N), N = size of the array.
        Reason: We have used 2 loops and using those loops, we are basically traversing the array once.

        Space Complexity: O(1) as we are not using any extra space to solve this problem.


    */


    private static void optimal(int[]arr,int n){
                int j = -1;
        for(int i = 0;i<n;i++){
            if(arr[i] ==0){
                j = i;
                break;
            }
        }


        if(j == -1){
            return;
        }

        for(int i = j+1;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }


        System.out.println("Array after moving all the zeroes to last :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
