package Unit3;

class Train {
    int tier1;
    int tier2;
    int tier3;

    Train(int tier1, int tier2, int tier3) {
        this.tier1 = tier1;
        this.tier2 = tier2;
        this.tier3 = tier3;
    }
    
    void display() {
        System.out.println("Seats available: " + tier1 + " " + tier2 + " " + tier3);
    }
}
class Reservation extends Train {
    int tier1Booked;
    int tier2Booked;
    int tier3Booked;

    Reservation(int tier1, int tier2, int tier3) {
        super(tier1, tier2, tier3);
    }
    void bookTickets(int tier, int quantity) {
        if (tier == 1) {
            tier1Booked += quantity;
            tier1 -= quantity;
        } else if (tier == 2) {
            tier2Booked += quantity;
            tier2 -= quantity;
        } else if (tier == 3) {
            tier3Booked += quantity;
            tier3 -= quantity;
        }
    }

    void cancelTickets(int tier, int quantity) {
        if (tier == 1) {
            tier1Booked -= quantity;
            tier1 += quantity;
        } else if (tier == 2) {
            tier2Booked -= quantity;
            tier2 += quantity;
        } else if (tier == 3) {
            tier3Booked -= quantity;
            tier3 += quantity;
        }
    }
    void display() {
        super.display();
        System.out.println("Seats booked: " + tier1Booked + " " + tier2Booked + " " + tier3Booked);
    }
}
public class TrainClassEx4 {

    public static void main(String[] args) {
        Reservation r = new Reservation(10, 20, 30);
        r.display();
        r.bookTickets(1, 5);
        r.bookTickets(2, 10);
        r.bookTickets(3, 15);
        r.cancelTickets(1, 2);
        r.cancelTickets(2, 4);
        r.display();
    }
}
