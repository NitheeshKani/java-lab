package Unit2;

class Customer {
    String name;
    String address;
    Long phone;
    
    Customer(String name, String address, Long phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
public class CustomerClassEx3A {
    public static void main(String[] args) {
        Customer c = new Customer("Nitheesh", "Pune", 1234567890L);
        System.out.println(c.name + " " + c.address + " " + c.phone);
    }
}  
