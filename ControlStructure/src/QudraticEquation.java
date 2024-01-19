import java.util.Scanner;

public class QudraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter co efficient of x^2:");
        int a = scan.nextInt();
        System.out.print("Enter co efficient of x:");
        int b = scan.nextInt();
        System.out.print("Enter constant:");
        int c = scan.nextInt();
        boolean var = (b*b - (4*a*c) >= 0)? true : false;
        if (var){
            int x = (-b + (b*b - (4*a*c)))/2*a;
            int y = (-b - (b*b - (4*a*c)))/2*a;
            System.out.println("x="+ x);
            System.out.println("y="+ y);
        }else{
            System.out.println("no real roots");
        }
        scan.close();
    }

}
