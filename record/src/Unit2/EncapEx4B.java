package Unit2;

class EncapB{
    private Long ac_no;
    private String name,email;
    private Float amount;
    
    void setAc_no(Long phone){
        this.ac_no = phone;
    }
    void setName(String name){
        this.name = name;
    }
    void setEmail(String email){
        this.email = email;
    }
    void setAmount(Float amount){
        this.amount = amount;
    }
    Long getAc_no(){
        return ac_no;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    Float getAmount(){
        return amount;
    }
}
public class EncapEx4B {
    public static void main(String[] args) {
        EncapB e = new EncapB();
        e.setAc_no(1234567890L);
        e.setName("Nitheesh");
        e.setEmail("p9wC2@example.com");
        e.setAmount(1000.0f);
        System.out.println(e.getAc_no() + " " + e.getName() + " " + e.getEmail() + " " + e.getAmount());
    }
}
