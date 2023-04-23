package domain;

import repository.PaymentProvider;
import resource.PayPalPaymentProvider;
import resource.StripePaymentProvider;
import service.PaymentService;

public class Main {
    public static void main(String[] args) throws Exception {
        PaymentProvider paypalGateway = new PayPalPaymentProvider();
        PaymentProvider stripeGateway = new StripePaymentProvider();

        PaymentService paypalPaymentService = new PaymentService(paypalGateway);
        PaymentService stripePaymentService = new PaymentService(stripeGateway);

        paypalPaymentService.processPayment(100.0);
        stripePaymentService.processPayment(200.0);
        }
    
}
