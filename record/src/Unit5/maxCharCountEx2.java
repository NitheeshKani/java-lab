package Unit5;

public class maxCharCountEx2 {
    public static int countHighestOccurringCharacter(String str) {
        int[] charCount = new int[256];
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        int maxCount = 0;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {

        String str = "Hello World";
        int count = countHighestOccurringCharacter(str);
        System.out.println("Count of highest occurring character in '" + str + "' is " + count);
    }
}
