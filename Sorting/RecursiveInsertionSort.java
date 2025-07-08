
public class RecursiveInsertionSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        recursiveInsertionSort(arr, 0, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void recursiveInsertionSort(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }

        int j = low;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recursiveInsertionSort(arr, ++low, high);

    }
}
