package resource;

import repository.PaymentProvider;

public class PayPalPaymentProvider implements PaymentProvider {
    @Override
    public void processPayment(double amount) {
        // Lógica para processamento de pagamento com PayPal
        System.out.println("processamento de pagamento com PayPal");
    }
}
