package Unit3;

class Bike {

    int gear;
    int speed;

    void applyBrake(int decrement) {
        speed -= decrement;
    }

    void speedUp(int increment) {
        speed += increment;
    }

    Bike() {
        gear = 1;
        speed = 0;
    }

    public String toString() {
        return ("Speed: " + speed + " Gear: " + gear);
    }
}

class MountainBike extends Bike {

    int seatHeight;

    void setHeight(int newValue) {
        seatHeight = newValue;
    }

    MountainBike(int startHeight, int startCadence) {
        seatHeight = startHeight;
        gear = startCadence;
        speed = 0;
    }

    public String toString() {
        return ("Speed: " + speed + " Gear: " + gear + " Seat height: " + seatHeight);
    }
}

public class BikeClassEx3 {

    public static void main(String[] args) {

        MountainBike mb = new MountainBike(5, 3);
        mb.setHeight(23);
        mb.speedUp(2);
        System.out.println(mb.toString());
        mb.applyBrake(1);
        mb.speedUp(5);
        System.out.println(mb.toString());
    }

}
