package Unit4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperationEx5 {
    public static void main(String[] args) {
        // Create an ArrayList of integers with object "L1"
        List<Integer> L1 = new ArrayList<>();
        L1.add(0);
        L1.add(1);
        L1.add(1);
        L1.add(2);

        // Create another ArrayList of integers with object "L2"
        List<Integer> L2 = new ArrayList<>();
        L2.add(1);
        L2.add(2);
        L2.add(3);

        // Display the values of objects L1 and L2
        System.out.println("L1: " + L1);
        System.out.println("L2: " + L2);

        // Add L2 to L1 from index 1
        L1.addAll(1, L2);
        System.out.println("L1 after adding L2 from index 1: " + L1);

        // Remove the element of L1 at index 1
        L1.remove(1);
        System.out.println("L1 after removing element at index 1: " + L1);

        // Print the element at index 3 from L1
        System.out.println("Element at index 3 in L1: " + L1.get(3));

        // Replace the index 0 with the value 5
        L1.set(0, 5);
        System.out.println("L1 after replacing index 0 with 5: " + L1);

        System.out.println("Final L1: " + L1);
    }
}
