package Unit1;
import java.util.Scanner;
public class DisplayEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Door no: ");
        String doorNo = input.nextLine();
        System.out.println("Enter your street: ");
        String street = input.nextLine();
        System.out.println("Enter your city: ");
        String city = input.nextLine();

        System.out.println("Door No: " + doorNo);
        System.out.println("Street: " + street);
        System.out.println("City: " + city);

        input.close();
    }
}
