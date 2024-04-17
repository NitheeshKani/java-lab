package Unit5;

public class StringSplitEx5 {

    public static boolean isHavingDuplicate(String str) {
        String[] words = str.split(" ");

        System.out.print("Duplicate Word:");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.print(words[j] + " ");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String str = "This sentence contains two words, one and two";
        if(isHavingDuplicate(str)){
            System.out.println("\nhaving  duplicate");
        }else{
            System.out.println("\nnot having duplicate");
        }
    }
}
