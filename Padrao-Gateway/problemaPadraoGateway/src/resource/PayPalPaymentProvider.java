package resource;

import repository.PaymentProvider;

// Implementação do serviço de pagamento do PayPal
public class PayPalPaymentProvider implements PaymentProvider {

    public boolean processPayment(String creditCardNumber, double amount) {
        // Lógica de processamento do pagamento via PayPal
        System.out.println("Pagamento de " + amount + " realizado com sucesso via PayPal.");
        return true;
    }
}

