package Unit3;

abstract class RRPaymentServices {
    private double balance;
    private int custId;

    RRPaymentServices(int custId, double balance) {
        this.custId = custId;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getCustId() {
        return custId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract void payBill(double amount);
}

class ShoppingPayment extends RRPaymentServices {
    static int counter = 0;
    String paymentId;

    ShoppingPayment(int custId, double balance) {
        super(custId, balance);
    }

    @Override
    void payBill(double amount) {
        if (amount < getBalance()) {
            System.out.println("Insufficient Balance");
            return;
        }

        paymentId = String.format("S%04d", ++counter);
        setBalance(getBalance() - amount);
    }

}

class CreditCardPayment extends RRPaymentServices {
    static int counter = 0;
    String paymentId;
    double cashBack;
    double balanceDue;

    CreditCardPayment(int custId, double balance) {
        super(custId, balance);
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getCashBack() {
        return cashBack;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    @Override
    void payBill(double amount) {
        // TODO Auto-generated method stub
        paymentId = String.format("C%04d", ++counter);
        if (amount > getBalance()) {
            cashBack = amount - getBalance();
            setBalance(0);
        } else if (amount < getBalance()) {
            setBalance(getBalance() - amount);
            balanceDue = getBalance();
        } else {
            setBalance(0);
            balanceDue = 0;
        }

    }
}

public class RRPaymentServicesEx8 {

    public static void main(String[] args) {
        
        CreditCardPayment c1 = new CreditCardPayment(123, 1000);
        c1.payBill(100);
        System.out
                .println(c1.getCustId() + " " + c1.getPaymentId() + " " + c1.getCashBack() + " " + c1.getBalanceDue());
        
        
                ShoppingPayment s1 = new ShoppingPayment(123, 1000);
        s1.payBill(100);
        System.out
                .println(c1.getCustId() + " " + s1.paymentId + " " + s1.getBalance());
    }

}
