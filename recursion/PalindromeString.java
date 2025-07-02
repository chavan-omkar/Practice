public class PalindromeString{
    public static void main(String[] args){
        String s = "aabaa";
        // boolean flag = isPalindrome(s);
         boolean flag = checkPalindromUsingRecursion(s,0);
        if(flag)
        System.out.print("Given String " + s + " is palindrome ");
        else
        System.out.print("Given String " + s + " is not palindrome ");
    }


    private static boolean isPalindrome(String s){
        int p1 =0;
        int p2 = s.length()-1;
        while(p1 < p2){
            if(s.charAt(p1)!=s.charAt(p2)){
                return false;
                
            }else{
                p1++;
                p2--;
            }
        }
        return true;
    }

    // using recursion
    private static boolean checkPalindromUsingRecursion(String s,int i){
        if(i>=(s.length()/2)){
            return true;
        }

        if(s.charAt(i) != s.charAt(s.length()-1-i)){
            return false;
        }

        return checkPalindromUsingRecursion(s,++i);



    }
}