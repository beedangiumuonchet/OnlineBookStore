
package model;

public class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VND bằng Thẻ tín dụng.");
    }
}

