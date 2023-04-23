package domain;

import service.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("1234-5678-9012-3456", 100.0);
    }

}
