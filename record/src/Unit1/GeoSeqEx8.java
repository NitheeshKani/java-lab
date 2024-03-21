package Unit1;
import java.util.Scanner;
public class GeoSeqEx8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = scan.nextInt();
        scan.close();

        int value = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(value + "  ");
            value *= 2;
        }

    }
}
