
import java.util.HashSet;

public class RmvDupFrmSorted {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        // bruteForce(arr);

        optimal(arr);
    }

    private static void bruteForce(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int k = set.size();
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
           
        }

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }


private static void optimal(int[]arr){
    int i=0;
    for(int j=1;j<arr.length;j++){

        if(arr[i] != arr[j]){
            i++;
            arr[i] = arr[j];
        }
    }


    for(int k=0;k<i+1;k++){
        System.out.print(arr[k]+" ");
    }
}

}
