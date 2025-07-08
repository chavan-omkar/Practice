
import java.util.*;
/*
Time complexity :- o(nlogn)
space complexity :- o(n)
*/
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, low, high);
        System.out.println("Array After Merge Sort : ");
        for (int k = 0; k <= high; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low >= high) {
            return;
        }
        System.out.println("22 "+ low+" " +mid);
        mergeSort(arr, low, mid);
        System.out.println("24 "+ (mid+1)+" " +high);
        mergeSort(arr, (mid + 1), high);
        System.out.println("26 "+ low + " " + mid + " "+high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            {
                temp.add(arr[right]);
                right++;
            }

        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
            System.out.println("59 "+ arr[i] + " "+ temp.get(i - low));
        }

    }

}
