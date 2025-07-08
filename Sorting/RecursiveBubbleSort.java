public class RecursiveBubbleSort{
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        recursiveBubbleSort(arr,n);
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }

    private static void recursiveBubbleSort(int[] arr,int n){
        if(n==1){
            return;
        }

        boolean swapped = false;
        for(int i=0;i<=n-2;i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swapped = true;
            }
        }

        if(!swapped){
            return;
        }

        recursiveBubbleSort(arr, n-1);
    }
}