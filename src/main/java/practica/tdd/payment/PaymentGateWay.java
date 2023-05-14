package practica.tdd.payment;

public interface PaymentGateWay {
    public PaymentResponse requesPayment(PaymentRequest paymentRequest);
}
