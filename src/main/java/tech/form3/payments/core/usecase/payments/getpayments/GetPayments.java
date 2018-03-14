package tech.form3.payments.core.usecase.payments.getpayments;

import tech.form3.payments.core.model.Payment;
import tech.form3.payments.core.usecase.payments.getpayment.PaymentNotFoundException;

import java.util.List;

public interface GetPayments {
    List<Payment> getAllPayments(Integer page, Integer limit, String sort, String selection, String eTag) throws PaymentsNotFoundException;
}
