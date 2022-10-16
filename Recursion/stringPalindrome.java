package Recursion;
public class stringPalindrome {
    public static void main(String[] args) {

        String s="aba";
        boolean result=checkPalindrome(s,0);
        System.out.println("palindrome: "+result);

    }

    private static boolean checkPalindrome(String s, int i) {

            if(i>=s.length()/2)
                return true;

            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;

            return checkPalindrome(s,i+1);

    }

}
