import java.util.Scanner;

public class CharacterHashing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        int[] hash = new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)] += 1 ;
        }

System.out.println("Enter the query count : ");
        int q = sc.nextInt();
        while(q-- > 0){

System.out.println("Enter the query : ");
            char c = sc.next().charAt(0);
            System.out.println(hash[c]);
        }
    }
}