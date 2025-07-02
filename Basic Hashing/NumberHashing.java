import java.util.Scanner;

public class NumberHashing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No : ");
        int n = sc.nextInt();
        int temp = 0;
        int[] arr = new int[n];
        // this step is called pre-storing
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]> temp){
                temp = arr[i];
            }

        }


// this step is called pre calculating where we are counting the frequencies and storing it
        int[] hash = new int[temp+1];
        for(int j =0;j<arr.length;j++){
            hash[arr[j]] += 1;
        }
        System.out.println("Enter the query count ");
        int q = sc.nextInt();
        while(q-- > 0){

            int no = sc.nextInt();
            //this step is called fetching
            System.out.println(hash[no] + " ");


        }

    }
}