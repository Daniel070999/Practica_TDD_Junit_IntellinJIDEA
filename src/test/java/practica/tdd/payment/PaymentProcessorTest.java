package practica.tdd.payment;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    private PaymentGateWay gateWay = null;
    private PaymentProcessor processor = null;
    @Before
    public void setUp(){
        gateWay = Mockito.mock(PaymentGateWay.class);
        processor = new PaymentProcessor(gateWay);
    }
    @Test
    public void give_payment_when_is_correct_than_ok() {
        Mockito.when(gateWay.requesPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        assertTrue(processor.makePayment(100));
    }
    @Test
    public void give_payment_when_is_wrong_than_error() {
        Mockito.when(gateWay.requesPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(processor.makePayment(100));
    }
}