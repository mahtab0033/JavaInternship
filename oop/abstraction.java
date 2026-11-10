
abstract class Payment {
    abstract void pay();

    void message() {
        System.out.println("Payment processing...");
    }
}

class UPIPayment extends Payment {
    void pay() {
        System.out.println("Payment through UPI");
    }
}

public class abstraction {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();

        upi.message();
        upi.pay();
    }
}
