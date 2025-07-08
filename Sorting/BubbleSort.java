
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length - 1;
        System.out.println("Array Before Bubble Sort : ");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int j = n; j >= 0; j--) {
            int didSwap = 0;
            for (int k = 0; k < j; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                    didSwap = 1;
                }
            }
            
            /* 
            added this check for best case scenario when array is already sorted
            it will bring down time complexity from o(N^2) to o(N) by stopping the loop after 1 iteration
            */
            if (didSwap == 0) {
                break;
            }

        }

        System.out.println("Array After Bubble Sort :");

        for (int l = 0; l <= n; l++) {
            System.out.print(arr[l] + " ");
        }
    }
}
