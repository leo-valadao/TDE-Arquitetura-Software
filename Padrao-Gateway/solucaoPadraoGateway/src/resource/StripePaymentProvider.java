package resource;

import repository.PaymentProvider;

public class StripePaymentProvider implements PaymentProvider {
    @Override
    public void processPayment(double amount) {
        // Lógica para processamento de pagamento com Stripe
        System.out.println("processamento de pagamento com Stripe");
    }
}

