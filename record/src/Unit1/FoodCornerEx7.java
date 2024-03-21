package Unit1;
import java.util.Scanner;
public class FoodCornerEx7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vegPrice = 12;
        int nonVegPrice = 15;

        System.out.println("Enter meal package V or N");
        String order = scan.nextLine();

        System.out.println("Enter meal package quantity");
        int quantity = scan.nextInt();

        System.out.println("Enter distance");
        double distance = scan.nextDouble();

        double total = 0;

        if (order.equals("V"))
            total = vegPrice * quantity;
        else if (order.equals("N"))
            total = nonVegPrice * quantity;
        else
            total = -1;

        if (distance < 6)
            total += (distance - 3) * 1;
        else
            total += 3 + (distance - 6) * 2;

        System.out.println("Foodtype   quantity   distance   total");
        System.out.println("\t" + order + "\t" + quantity + "\t" + distance + "\t" + total);

        scan.close();
    }
}
