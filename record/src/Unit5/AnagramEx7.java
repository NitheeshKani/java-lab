package Unit5;

import java.util.Arrays;

public class AnagramEx7 {
    static String isAnagram(String str1, String str2) {
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        if (Arrays.equals(str1Arr, str2Arr)) {
            return str1 + " and " + str2 + " are anagrams";
        }
        return str1 + " and " + str2 + " are not anagrams";

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen"));
        System.out.println(isAnagram("hello", "bye"));
    }
}
