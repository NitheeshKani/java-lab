package Unit2;

class Encap {
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
public class EncapEx4A {
    public static void main(String[] args) {
        Encap e = new Encap();
        e.setAge(20);
        System.out.println(e.getAge());
    }
}
