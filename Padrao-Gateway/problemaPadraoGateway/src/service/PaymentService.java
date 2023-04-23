package service;

import repository.PaymentProvider;
import resource.PayPalPaymentProvider;
import resource.StripePaymentProvider;

// Classe que representa o serviço de pagamento
public class PaymentService {

    public boolean processPayment(String creditCardNumber, double amount) {
        PaymentProvider paymentProvider;

        // Verifica qual gateway de pagamento usar
        if (creditCardNumber.startsWith("4")) {
            paymentProvider = new PayPalPaymentProvider();
        } else {
            paymentProvider = new StripePaymentProvider();
        }

        // Processa o pagamento usando o gateway escolhido
        boolean result = paymentProvider.processPayment(creditCardNumber, amount);

        return result;
    }
}
