package resource;

import repository.PaymentProvider;

// Implementação do serviço de pagamento do Stripe
public class StripePaymentProvider implements PaymentProvider {

    public boolean processPayment(String creditCardNumber, double amount) {
        // Lógica de processamento do pagamento via Stripe
        System.out.println("Pagamento de " + amount + " realizado com sucesso via Stripe.");
        return true;
    }
}

