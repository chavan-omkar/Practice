
import java.util.Scanner;

public class RotateByN {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to rotate by :- ");
        int k = sc.nextInt();
        System.out.println("Enter the direction :- ");
        String direction = sc.next();

        // bruteForceRotateRight(arr, n, k);
        // bruteForceRotateLeft(arr, n, k);


        /*

            Time Complexity - O(N) where N is the number of elements in an array

            Space Complexity - O(1) since no extra space is required

        */

        switch (direction) {
            case "right":
                rightRotate(arr, n, k);
                break;
            case "left":
                leftRotate(arr,n,k);
                break;
            default:
                System.out.print("Entered Direction is wrong");
                break;
        }

    }

    /*

            Time Complexity: O(n)

            Space Complexity: O(k) since k array element needs to be stored in temp array

     */
    private static void bruteForceRotateRight(int[] arr, int n, int k) {
        if (n == 0) {
            return;
        }

        k = k % n;

        if (k > n) {
            return;
        }

        int[] temp = new int[k];

        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }

        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Array After rotating to right :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    /*

            Time Complexity: O(n)

            Space Complexity: O(k) since k array element needs to be stored in temp array

     */
    private static void bruteForceRotateLeft(int[] arr, int n, int k) {

        if (n == 0) {
            return;
        }

        k = k % n;

        if (k > n) {
            return;
        }

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }

        for (int i = 0; i < k; i++) {
            arr[i + n - k] = temp[i];
        }

        System.out.println("Array After rotating to left :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void rightRotate(int[] arr, int n, int k) {

        reverseRight(arr, 0, k - 1);
        reverseRight(arr, k, n - 1);
        reverseRight(arr, 0, n - 1);

        System.out.println("Array after roatating right :-");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void reverseRight(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void leftRotate(int[] arr,int n,int k) {

        reverseLeft(arr,0,k-1);
        reverseLeft(arr, k, n-1);
        reverseLeft(arr,0,n-1);

        System.out.println("Array after roatating left :-");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void reverseLeft(int[] arr,int start,int end){
        while(start <= end){
            int temp = arr[start];
            arr[start]=  arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
    }
}
