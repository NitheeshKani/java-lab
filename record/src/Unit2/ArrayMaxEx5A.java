package Unit2;

public class ArrayMaxEx5A {
    public static void main(String[] args) {
        int[] arr = {1, 3};
        int sum = 0;
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            pro *= arr[i];
        }
        int max = Math.max(sum, pro);
        System.out.println(max);
    }
}
