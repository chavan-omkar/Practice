public class InsertionSort{
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length-1;
        System.out.println("Array Before Insertion Sort : ");
        for(int s=0;s<=n;s++){
            System.out.print(arr[s]+ " ");
        }

        for(int i=0;i<=n;i++){
            int j=i;
            while(j>0 && (arr[j-1] > arr[j])){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println();
        System.out.println("Array After Insertion Sort : ");
        for(int k=0;k<=n;k++){
            System.out.print(arr[k]+ " ");
        }
    }
}