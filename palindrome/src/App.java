import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        String x = scan.nextLine();

        String rev = "";

        for(int i = x.length()-1; i >= 0; i--){
            char temp = x.charAt(i);
            rev += temp;
        }
        
        System.out.println(rev);
        
        if (rev.equals(x)){
            System.out.println("palindrome");
        }else{
            System.out.println("!palindrome");
        }
        scan.close();

    }
}
