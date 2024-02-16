public class App {
    public static void main(String[] args) {
		int[] numbers = {68,79,86,99,23,2,41,100};
		System.out.println("Sum of even numbers: " +  calculateSumOfEvenNumbers(numbers));
	}

    public static int calculateSumOfEvenNumbers(int[] numbers) {
        int avg =0;
        for (int i : numbers) {
            double j = i;
            if(j%2 == 0){
                avg += j;
            }
        }
        
        return avg;
    }
}
