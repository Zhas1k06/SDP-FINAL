package strategy;

public class OrderPaymentContext {
    private PaymentStrategy paymentStrategy;

    public OrderPaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        paymentStrategy.pay(amount);
    }
}