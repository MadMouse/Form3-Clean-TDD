package tech.form3.payments.endpoints.rest;

import org.junit.Test;
import tech.form3.payments.core.model.Payment;
import tech.form3.payments.core.usecase.payments.getpayment.PaymentNotFoundException;
import tech.form3.payments.core.usecase.payments.getpayment.impl.GetPaymentByIdImpl;
import tech.form3.payments.endpoints.GetPaymentByIdEndpoint;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static tech.form3.payments.core.usecase.payments.PaymentUtils.PopulatedDomainPayment;
import static tech.form3.payments.core.usecase.payments.PaymentUtils.PopulatedNetworkPayment;

public class GetPaymentByIdEndpointTest {

    private static String TEST_PAYMENT_ID = "4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43";
    GetPaymentByIdImpl getPaymentById = mock(GetPaymentByIdImpl.class);

    GetPaymentByIdEndpoint getPaymentByIdEndpoint = new GetPaymentByIdEndpoint(getPaymentById);


    @Test
    public void getPayment_WhenId_Payment() throws Exception {
        givenPaymentExists();

        tech.form3.payments.dataproviders.network.model.Payment paymentDto = getPaymentByIdEndpoint.getPayment(TEST_PAYMENT_ID);

        tech.form3.payments.dataproviders.network.model.Payment expectedPayment =  PopulatedNetworkPayment();
        //assertThat(paymentDto, equalTo(expectedPayment));
        //todo Convert to matcher to compare the objects correctly.

        assertThat(paymentDto.getId(), is(TEST_PAYMENT_ID));
    }

    @Test
    public void error_WhenInvaildId_PaymentNotFoundException() throws Exception {
        givenPaymentDoesNotExist();
        assertThatExceptionOfType(PaymentNotFoundException.class).isThrownBy(() -> getPaymentById.getPaymentById(TEST_PAYMENT_ID));
    }

    private void givenPaymentExists() throws IOException {
        Payment payment =  PopulatedDomainPayment();
        when(getPaymentById.getPaymentById(TEST_PAYMENT_ID)).thenReturn(payment);
    }

    private void givenPaymentDoesNotExist() {
        when(getPaymentById.getPaymentById(TEST_PAYMENT_ID)).thenThrow(new PaymentNotFoundException());
    }
}
