public class ReverseArray{
    public static void main(String[] args){
        int n =5;
        int[] arr = {5,4,3,2,1};
        int[] arr1 = arr;
        // bruteForce(arr,n); 
        // System.out.println();
        // optimalApproach(arr,n);
        // System.out.println();
        recursiveMethod(arr1,0,n-1);
         print(arr1);
    }
/*
O(N) time and space complexity as 2 arrays are used 
and need to traverse whole array
*/
private static void bruteForce(int[]arr,int n){
    int[] ans = new int[n];
    for(int i=arr.length-1;i>=0;i--){
        ans[n-i-1] = arr[i];
    }
    print(ans);
}



/*
O(N) time complexity with single pass 
O(1) space complexity using same array only
*/
private static void optimalApproach(int[]arr,int n){
    int p1 = 0;
    int p2 = n-1;

    while(p1 < p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
        p1++;
        p2--;
    }
print(arr);

}


private static void recursiveMethod(int[]arr1,int start,int end)
{
    if(start < end){
    int temp = arr1[start];
    arr1[start]=arr1[end];
    arr1[end] = temp;
    start++;
    end--;
    recursiveMethod(arr1,start,end);
    }    

}
    private static void print(int[] ads){
        for(int i=0;i<ads.length;i++){
            System.out.print(ads[i] + " ");
        }
    }
}