package tech.form3.payments.core.usecase.payments.addpayment;

import com.sun.javaws.exceptions.InvalidArgumentException;
import tech.form3.payments.core.model.Payment;

public interface AddPayment {
    void addPayment(Payment payment) throws PaymentInsertFailedException, InvalidArgumentException;
}
