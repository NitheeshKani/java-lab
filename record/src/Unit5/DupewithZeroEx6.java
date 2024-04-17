package Unit5;

import java.util.Arrays;

public class DupewithZeroEx6 {

    public static void removeDuplicates(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 2, 2, 3, 4, 5 },
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 2, 3, 4, 5, 6, 7 },
                { 1, 2, 1, 1, 1, 1, 1 }
        };

        for (int[] a : arr) {
            removeDuplicates(a);
            System.out.println(Arrays.toString(a));
        }
    }
}
