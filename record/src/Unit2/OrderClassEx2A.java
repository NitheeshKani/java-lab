package Unit2;

class Order {
    int id;
    String orderedFood;
    String status;
    double total;

    double calculateTotal(int price) {
        double tot = price + price * 0.05;
        return tot;
    }
    
}
public class OrderClassEx2A {
    public static void main(String[] args) {
        Order o = new Order();
        o.id = 1;
        o.orderedFood = "Idli";
        o.status = "Ordered";
        o.total = o.calculateTotal(15);
        System.out.println(o.id + " " + o.orderedFood + " " + o.status + " " + o.total);
    }
}
