
    

class Payment {
    void pay(int amount) {
        System.out.println("Cash Payment: " + amount);
    }

    void pay(double amount) {
        System.out.println("Online Payment: " + amount);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Payment p = new Payment();

        p.pay(1000);
        p.pay(1500.50);
    }
}
