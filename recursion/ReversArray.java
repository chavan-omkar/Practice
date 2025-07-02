public class ReversArray{
    /*
    this is java 21 feature where we dont need to write public static void main(String[] args) explicitly
    but this is recommended for simple and single class not for complex projects
    also for using this we will need to use below commands to use 
    we need to compile the file using --release command along with the version
    and also we will need to use --enable-preview 
    javac --release 21 --enable-preview ReversArray.java
    java --enable-preview ReversArray

    */
    void main(){
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        reverseArray(arr,start,end);

        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();

        twoPointerMethods(arr);

        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[]ans = new int[arr.length];
        simplest(arr,ans);

        for(int i=0;i<arr.length;i++){
        System.out.print(ans[i] + " ");
        }

        
    }

// this is using recusrion
    private void reverseArray(int[]arr,int start,int end){
        if(start > end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        reverseArray(arr,start,end);
    
    }

// done using two pointers and in single pass
    private void twoPointerMethods(int[]arr){
        int p1 =0;
        int p2 = arr.length-1;
        while(p1 < p2){
            int temp = arr[p1];
            arr[p1]=arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }

    private void simplest(int[]arr,int[]arr2){
        int n = arr.length-1;
        for(int i = n;i>=0;i--){
            arr2[n-i]=arr[i];
        }
    }
}