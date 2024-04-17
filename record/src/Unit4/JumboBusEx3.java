package Unit4;

class InvalidCouponException extends Exception {

    InvalidCouponException(String errorMessage) {
        super(errorMessage);
    }
}

class InvalidDestinationException extends Exception {

    InvalidDestinationException(String errorMessage) {
        super(errorMessage);
    }
}

class InvalidPackageException extends Exception {

    InvalidPackageException(String errorMessage) {
        super(errorMessage);
    }
}

class BusBooking {
    int totalPrice;
    int bookingId;
    String destination;
    String packageType;

    Boolean isCouponApplied = false;
    Boolean isDestinationValid = false;
    Boolean isPackageValid = false;

    BusBooking(int bookingId, String destination, String packageType, int numberOfMembers, String couponCode)
            throws Exception {
        this.bookingId = bookingId;
        this.destination = destination;
        this.packageType = packageType;
        this.totalPrice = 0;

        validateCoupon(couponCode, numberOfMembers);
        validateDestination();
        validatePackage();

        calculateTotalPrice();
        System.out.println("________________________");
    }

    void validateCoupon(String couponCode, int numberOfMembers) throws InvalidCouponException {
        if ((couponCode.equalsIgnoreCase("BIGBUS") && numberOfMembers >= 10)
                || (couponCode.equalsIgnoreCase("MAGICBUS") && numberOfMembers >= 15)) {
            System.err.println("Valid Coupon");
            isCouponApplied = true;
        } else {
            throw new InvalidCouponException("Invalid Coupon");
        }
    }

    void validateDestination() throws InvalidDestinationException {
        String[] validDestination = { "washington", "philadelphia", "orlando", "Boston", "Atlanta" };
        for (String dest : validDestination) {
            if (destination.equalsIgnoreCase(dest)) {
                System.err.println("Valid Destination");
                isDestinationValid = true;
                break;
            }
        }
        if (!isDestinationValid){
            throw new InvalidDestinationException("Invalid Destination");
        }
    }

    void validatePackage() throws InvalidPackageException {
        if (packageType.equalsIgnoreCase("regular") || packageType.equalsIgnoreCase("premium")) {
            System.err.println("Valid Package");
            isPackageValid = true;
        } else {
            throw new InvalidPackageException("Invalid Package");
        }
    }

    void calculateTotalPrice() {
        if (isCouponApplied && isDestinationValid && isPackageValid) {
            if (packageType.equalsIgnoreCase("regular")) {
                totalPrice = 500;
            } else {
                totalPrice = 800;
            }
            System.out.println("Total Price: " + totalPrice);
            System.out.println("Booking Successful");
        } else {
            System.out.println("Booking Failed");
        }
    }
}

public class JumboBusEx3 {

    public static void main(String[] args) {
        try {

            BusBooking b1 = new BusBooking(101, "washington", "premium", 15, "BIGBUS");

            BusBooking b2 = new BusBooking(102, "Boston", "regular", 15, "MAGICBUS");

            BusBooking b3 = new BusBooking(103, "orlando", "error", 15, "BIGBUS");
            

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
