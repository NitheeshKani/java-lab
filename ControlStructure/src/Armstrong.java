public class Armstrong {
    // 371 = 33 + 73 + 13
    public static void main(String[] args) {
        String number = "371";
        int int_number = Integer.parseInt(number);
        int tot = 0;

        for (int i = number.length()-1; i >= 0; i--) {
            int digit = Character.getNumericValue(number.charAt(i));
            digit = digit * 10 + number.length();
            tot += digit;

        }
        
        
        
        if (int_number == tot){
            System.out.println("Armstrong");
        }else{
            System.out.println("!Armstrong");
        }
    }
}
