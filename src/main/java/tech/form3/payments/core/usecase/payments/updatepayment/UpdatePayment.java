package tech.form3.payments.core.usecase.payments.updatepayment;

import com.sun.javaws.exceptions.InvalidArgumentException;
import tech.form3.payments.core.model.Payment;

public interface UpdatePayment {
    void updatePayment(Payment payment) throws  InvalidArgumentException;
}
