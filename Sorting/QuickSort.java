
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        Integer[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println("Array Before Sorting : ");
        for (Integer a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        quickSort(Arrays.asList(arr));
        System.out.println("Array After Quick Sorting : ");
        for (Integer arr1 : arr) {
            System.out.print(arr1 + " ");
        }
    }

    private static List<Integer> quickSort(List<Integer> arr) {

        qs(arr, 0, arr.size() - 1);
        return arr;

    }

    private static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    private static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
}
