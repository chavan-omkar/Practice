import java.util.Scanner;
public class Rectangle{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columsn Values");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        System.out.println("Printing the pattern");

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}