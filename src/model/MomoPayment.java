package model;

public class MomoPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VND bằng MoMo.");
    }
}
