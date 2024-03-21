package Unit1;
public class ChicRabbitEx9 {
    public static void main(String[] args) {
        int head = 150, legs = 500;
        double x, y;

        x = (legs - 2 * head) / 2;
        y = head - x;

        System.out.println("Chickens = " + x + " Rabbits = " + y);
    }
}
