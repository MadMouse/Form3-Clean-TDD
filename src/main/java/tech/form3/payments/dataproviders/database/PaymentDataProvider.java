package tech.form3.payments.dataproviders.database;

import com.sun.javaws.exceptions.InvalidArgumentException;
import tech.form3.payments.core.model.Payment;
import tech.form3.payments.core.usecase.payments.addpayment.AddPayment;
import tech.form3.payments.core.usecase.payments.addpayment.PaymentInsertFailedException;
import tech.form3.payments.core.usecase.payments.deletepayment.DeletePayment;
import tech.form3.payments.core.usecase.payments.getpayment.GetPaymentById;
import tech.form3.payments.core.usecase.payments.getpayment.PaymentNotFoundException;
import tech.form3.payments.core.usecase.payments.getpayments.GetPayments;
import tech.form3.payments.core.usecase.payments.getpayments.PaymentsNotFoundException;
import tech.form3.payments.core.usecase.payments.updatepayment.UpdatePayment;

import java.util.List;

public class PaymentDataProvider implements GetPayments,GetPaymentById, AddPayment,UpdatePayment,DeletePayment {


    @Override
    public void addPayment(Payment payment) throws PaymentInsertFailedException, InvalidArgumentException {

    }

    @Override
    public void deletePayment(String id) throws PaymentsNotFoundException, InvalidArgumentException {

    }

    @Override
    public Payment getPaymentById(String id) throws PaymentNotFoundException {
        return null;
    }

    @Override
    public List<Payment> getAllPayments(Integer page, Integer limit, String sort, String selection, String eTag) throws PaymentNotFoundException {
        return null;
    }

    @Override
    public void updatePayment(Payment payment) throws InvalidArgumentException {

    }
}
