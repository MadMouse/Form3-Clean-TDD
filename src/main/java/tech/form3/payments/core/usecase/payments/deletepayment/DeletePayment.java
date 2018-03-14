package tech.form3.payments.core.usecase.payments.deletepayment;

import com.sun.javaws.exceptions.InvalidArgumentException;
import tech.form3.payments.core.usecase.payments.getpayments.PaymentsNotFoundException;

public interface DeletePayment {
    void deletePayment(String id) throws PaymentsNotFoundException, InvalidArgumentException;
}
