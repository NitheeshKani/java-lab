package Unit2;

class ModOrder {
    int id;
    String orderedFood;
    String status;
    double total;

    
    ModOrder(int id, String orderedFood){
        this.id = id;
        this.orderedFood = orderedFood;
        this.status = "Ordered";
    }
}
public class modOrderEx3B {
    public static void main(String[] args) {
        ModOrder o1 = new ModOrder(1, "Idli");
        System.out.println(o1.id + " " + o1.orderedFood + " " + o1.status);
    }
}
