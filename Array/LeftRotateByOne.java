
public class LeftRotateByOne {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5};

        // bruteForce(arr);
        optimal(arr);

    }

    /*
            time complexity :- o(N);
            space Complexity :- o(N) as we are using another temp array

     */
    private static void bruteForce(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            temp[i - 1] = arr[i];
        }

        temp[arr.length - 1] = arr[0];

        for (int i = 0; i < temp.length - 2; i++) {
            System.out.print(temp[i] + " ");
        }
    }


    /*
            time complexity :- o(N);
            space Complexity :- o(1)
     */
    private static void optimal(int[] arr) {
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
