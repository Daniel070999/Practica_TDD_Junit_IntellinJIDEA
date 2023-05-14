package practica.tdd.payment;

public class PaymentProcessor {

    private PaymentGateWay gateWay;

    public PaymentProcessor(PaymentGateWay gateWay) {
        this.gateWay = gateWay;
    }

    public boolean makePayment(double amount){
        PaymentResponse response = gateWay.requesPayment(new PaymentRequest(amount));
        if(response.getStatus() == PaymentResponse.PaymentStatus.OK){
            return true;
        }else{
            return false;
        }
    }
}
