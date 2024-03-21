package Unit2;

class Resturent {
    String name;
    String address;
    Long phone;
    float rating;

    void display() {
        System.out.println(name + " " + address + " " + phone + " " + rating);
    }
}
public class ResturentEx2B {
    public static void main(String[] args) {
        Resturent r = new Resturent();
        r.name = "KFC";
        r.address = "Pune";
        r.phone = 1234567890L;
        r.rating = 4.5f;
        r.display();
    }
}
