package tech.form3.payments.core.usecase.payments.getPayment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import tech.form3.payments.core.model.Payment;
import tech.form3.payments.core.usecase.payments.getpayment.GetPaymentById;
import tech.form3.payments.core.usecase.payments.getpayment.PaymentNotFoundException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static tech.form3.payments.core.usecase.payments.PaymentUtils.NoAtrrPayment;

public class GetPaymentUseCaseTest {

    GetPaymentById getAppPayments = mock(GetPaymentById.class);

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void GetPayment_byId_NotFoundException() throws Exception{
        thrown.expect(PaymentNotFoundException.class);
//Todo Add more tests to Not Found Exception
//        thrown.expectMessage(startsWith("some Message"));
//        thrown.expect(hasProperty("response", hasProperty("status", is(404))));
        throwPaymentNotFoundException();
    }

    private void throwPaymentNotFoundException(){
        throw new PaymentNotFoundException();
    }

    @Test
    public void GetPayment_byId_returnPayment() throws Exception{
        givenPayment("id_1", NoAtrrPayment("id_1","org_1"));
        Payment payment = getAppPayments.getPaymentById("id_1");
        assertThat(payment.getId(), is("id_1"));
    }


    private void givenPayment(String id, Payment payment ) {
        when(getAppPayments.getPaymentById(id)).thenReturn(payment);
    }



}
