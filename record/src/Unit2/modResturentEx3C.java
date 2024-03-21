package Unit2;
class ModResturent {
    String name;
    String address;
    Long phone;
    float rating;
    
    ModResturent(String name, String address, Long phone, float rating) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.rating = rating;
    }

    void display() {
        System.out.println(name + " " + address + " " + phone + " " + rating);
    }
}
public class modResturentEx3C {
    public static void main(String[] args) {
        ModResturent r = new ModResturent("KFC", "Pune", 1234567890L, 4.5f);
        r.display();
    }
}
