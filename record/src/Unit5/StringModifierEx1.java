package Unit5;

public class StringModifierEx1 {
    static String modify(String str) {
        str = str.replace(" ", "");

        String modifiedString = "";
        for (int i = 0; i < str.length(); i++) {
            if (modifiedString.indexOf(str.charAt(i)) == -1) {
                modifiedString += str.charAt(i);
            }
        }

        return modifiedString;
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Unmodefied: " + str);
        System.out.println("Modified: " + modify(str));
    }
}
