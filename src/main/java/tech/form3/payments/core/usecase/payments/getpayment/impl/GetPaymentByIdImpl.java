package tech.form3.payments.core.usecase.payments.getpayment.impl;

import tech.form3.payments.core.model.Payment;
import tech.form3.payments.core.usecase.payments.getpayment.GetPaymentById;
import tech.form3.payments.core.usecase.payments.getpayment.PaymentNotFoundException;

public class GetPaymentByIdImpl {
    private GetPaymentById getPaymentById;

    public GetPaymentByIdImpl(GetPaymentById getPaymentById) {
        this.getPaymentById = getPaymentById;
    }

    public Payment getPaymentById(String id) {
        Payment payment = getPaymentById.getPaymentById(id);

        if(payment == null) {
            throw new PaymentNotFoundException();
        }

        return payment;
    }
}
