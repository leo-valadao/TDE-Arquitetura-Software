package repository;

public interface PaymentProvider {
    boolean processPayment(String creditCardNumber, double amount);
}
