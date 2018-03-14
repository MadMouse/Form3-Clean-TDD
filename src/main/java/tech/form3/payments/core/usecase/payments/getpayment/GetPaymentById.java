package tech.form3.payments.core.usecase.payments.getpayment;

import tech.form3.payments.core.model.Payment;

public interface GetPaymentById {
    Payment getPaymentById(String id) throws PaymentNotFoundException;
}
