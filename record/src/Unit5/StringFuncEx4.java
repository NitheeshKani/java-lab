package Unit5;

public class StringFuncEx4 {

    public static void main(String[] args) {
        String s = " GeeksforGeeks ";
        String s1 = "Geeks";
        String s2 = "forGeeks";
        String s4 = "Learn Share Learn";

        System.out.println("Length of s: " + s.length());
        System.out.println("Character at third position of s: " + s.charAt(2));
        System.out.println("Substring starting from index 3 of s: " + s.substring(3));
        System.out.println("Substring starting from index 2 to index 5 of s: " + s.substring(2,
                5));
        System.out.println("Concatenation of s1 and s2: " + s1.concat(s2));
        System.out.println("Comparison of s1 and s2: " + s1.compareTo(s2));
        String s3 = "forgeeks";
        System.out.println("Uppercase version of s3: " + s3.toUpperCase());
        System.out.println("Lowercase version of s3: " + s3.toLowerCase());
        System.out.println("String s after replacing 'f' with 'g': " + s.replace('f', 'g'));
    }
}
