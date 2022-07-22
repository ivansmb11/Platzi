package com.platzi.javatests.payments;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PaymentProcessorTest {
    
    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setUp() {
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }
    
    @Test
    public void testPaymentIsCorrect() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any(PaymentRequest.class)))
            .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void testPaymentIsIncorrect() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any(PaymentRequest.class)))
            .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }
}
