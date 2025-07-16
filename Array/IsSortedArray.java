
public class IsSortedArray {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52,20, 9};
        // int[] arr = {9, 13, 20, 24, 46, 52};
// boolean isSorted = bruteForce(arr);
        boolean isSorted = optimal(arr);

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    /*
        travesering through the array for every element

        time comple :- o(n^2);
        space comple :- o(n);

     */
    private static boolean bruteForce(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }

        return true;
    }
/*

Single Traversal approach

this method will traverse through the array only once reducing time complexity
as it implements the logic that if current element is greater than next element then array is not sorted

time complexity :- o(n);
space complexity :- o(1);
*/
    private static boolean optimal(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
