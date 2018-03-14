package tech.form3.payments.core.usecase.payments.getpayments.impl;

import tech.form3.payments.core.model.Payment;
import tech.form3.payments.core.usecase.payments.getpayments.GetPayments;
import tech.form3.payments.core.usecase.payments.getpayments.PaymentsNotFoundException;

import java.util.List;

public class GetPaymentsImpl {
    private GetPayments getPayments;

    public GetPaymentsImpl(GetPayments getPayments) {
        this.getPayments = getPayments;
    }

    public List<Payment> getAllPayments(Integer page, Integer limit, String sort, String selection, String eTag) {
        List<Payment> payments = getPayments.getAllPayments(page,limit,sort,selection,eTag);

        if(payments.size() == 0) {
            throw new PaymentsNotFoundException();
        }

        return payments;
    }
}
