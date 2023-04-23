package service;

import repository.PaymentProvider;

public class PaymentService {
    private PaymentProvider gateway;

    public PaymentService(PaymentProvider gateway) {
        this.gateway = gateway;
    }

    public void processPayment(double amount) {
        gateway.processPayment(amount);
    }
}

