package factory;

import model.CreditCardPayment;
import model.MomoPayment;
import model.PaymentMethod;

public class PaymentFactory {
    public static PaymentMethod createPayment(String type) {
        return switch (type.toLowerCase()) {
            case "momo" -> new MomoPayment();
            case "credit" -> new CreditCardPayment();
            default -> throw new IllegalArgumentException("Loại thanh toán không hợp lệ");
        };
    }
}
