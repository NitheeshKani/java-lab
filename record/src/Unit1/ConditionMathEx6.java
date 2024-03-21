package Unit1;
import java.util.Scanner;

public class ConditionMathEx6 {
    public static void main(String[] args) {
        int pro = 1, x;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the " + (i + 1) + "st number:");
            x = scan.nextInt();
            pro *= x;
            if (x == 7 && i == 2) {
                pro = -1;
            } else if (x == 7) {
                pro = 1;
            }
        }
        System.out.println(pro);
        scan.close();
    }
}
