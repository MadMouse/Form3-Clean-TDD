package tech.form3.payments.core.usecase.payments.addpayment.impl;

import com.sun.javaws.exceptions.InvalidArgumentException;
import tech.form3.payments.core.model.Payment;
import tech.form3.payments.core.usecase.payments.addpayment.AddPayment;

public class AddPaymentImpl {
    private AddPayment addPayment;

    public AddPaymentImpl(AddPayment addPayment) {
        this.addPayment = addPayment;
    }

    public void addPayment(Payment payment) throws InvalidArgumentException {
        addPayment.addPayment(payment);
    }
}
