import java.util.Scanner;
// public class RightAngledNumberPyramid{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n = sc.nextInt();
//          System.out.println("Printing Your Pattern");
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
        
//             }
//             System.out.println();
//         }
//     }
    
// }


public class RightAngledNumberPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
 System.out.println("Printing your pattern");
 for (int i=1;i<=n;i++){
    for(int j=0;j<i;j++){
        System.out.print(i+" ");
    }
    System.out.println();
 }
    }
}