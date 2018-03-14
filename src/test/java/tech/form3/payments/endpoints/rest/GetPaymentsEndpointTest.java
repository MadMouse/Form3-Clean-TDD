package tech.form3.payments.endpoints.rest;

import org.junit.Test;
import tech.form3.payments.core.model.Payment;
import tech.form3.payments.core.usecase.payments.getpayment.PaymentNotFoundException;
import tech.form3.payments.core.usecase.payments.getpayments.PaymentsNotFoundException;
import tech.form3.payments.core.usecase.payments.getpayments.impl.GetPaymentsImpl;
import tech.form3.payments.endpoints.GetPaymentsEndpoint;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static tech.form3.payments.core.usecase.payments.PaymentUtils.PopulatedDomainPayments;

public class GetPaymentsEndpointTest {

    GetPaymentsImpl getPaymentsImpl = mock(GetPaymentsImpl.class);

    GetPaymentsEndpoint getPaymentsEndpoint = new GetPaymentsEndpoint(getPaymentsImpl);


    @Test
    public void getPayments_WhenNULL_ListPayments() throws Exception {
        givenPaymentsExists();
        List<tech.form3.payments.dataproviders.network.model.Payment> paymentsDto = getPaymentsEndpoint.getPayments(null,null,null,null,null);
        assertThat(paymentsDto.size(), is(5));
    }

    @Test
    public void error_WhenInvaildId_PaymentsNotFoundException() throws Exception {
        givenPaymentsDoNotExist();
        assertThatExceptionOfType(PaymentsNotFoundException.class).isThrownBy(() -> getPaymentsImpl.getAllPayments(null,null,null,null,null));
    }

    private void givenPaymentsExists() throws IOException {
        List<Payment> payments = PopulatedDomainPayments(5);
        when(getPaymentsImpl.getAllPayments(null,null,null,null,null)).thenReturn(payments);
    }

    private void givenPaymentsDoNotExist() {
        when(getPaymentsImpl.getAllPayments(null,null,null,null,null)).thenThrow(new PaymentsNotFoundException());
    }
}
