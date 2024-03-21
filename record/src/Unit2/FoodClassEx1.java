package Unit2;

class Food {
    String name; 
    String cusine;
    String type;
    int quantity;
    double price;

    
}
public class FoodClassEx1 {
    public static void main(String[] args) {
        Food f  = new Food();
        f.name = "Idli";
        f.cusine = "South Indian";
        f.type = "Veg";
        f.quantity = 2;
        f.price = 15;
        System.out.println(f.name + " " + f.cusine + " " + f.type + " " + f.quantity + " " + f.price);
    }
}
