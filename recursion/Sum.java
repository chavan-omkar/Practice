public class Sum{
    public static void main(String[] args){
        int n = 5;
        System.out.println(calculateSum(n));
        System.out.println(printSum(n));
    }

private static int calculateSum(int n){
    return n*((n+1)/2);
}

private static int printSum(int n){
    if(n<=0){
        return 0;
    }
    return n + printSum(n-1);
}

}