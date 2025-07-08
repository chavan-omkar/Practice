
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length - 1;

        System.out.println("Before Sorting ");
        for (int s = 0; s <= n; s++) {
            System.out.print(arr[s] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j <= n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

        System.out.println("After Sorting ");

        for (int k = 0; k <= n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
