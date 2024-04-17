package Unit5;

public class PalindromeEx3 {

    public static String isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            return str + " is Palindrome";
        }
        return str + " is not Palindrome";
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("racecar"));
    }
}
