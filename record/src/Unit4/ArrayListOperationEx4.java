package Unit4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperationEx4 {
    public static void main(String[] args) {

        List<String> languages = new ArrayList<>();
        languages.add("C++");
        languages.add("Java");
        languages.add("C");
        languages.add("Python");

        System.out.println("Original ArrayList: " + languages);

        String stringAtIndex2 = languages.get(2);
        System.out.println("String at index 2: " + stringAtIndex2);

        languages.set(2, "Programming");
        System.out.println("ArrayList after changing string at index 2: " + languages);

        languages.remove(0);
        System.out.println("ArrayList after removing string at index 0: " + languages);
    }
}
