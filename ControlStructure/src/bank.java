public class bank {
    public static void main(String[] args) {
        String number = "123";
        int int_number = Integer.parseInt(number);
        int tot = 0;

        for (int i = number.length()-1; i >= 0; i--) {
            int digit = Character.getNumericValue(number.charAt(i));
            tot += digit;

        }
        if (int_number%tot == 0){
            System.out.println("divisable");
        }else{
            System.out.println("!divisable");
        }
    }
}