package tech.form3.payments.core.usecase.payments.getpayments.impl;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import tech.form3.payments.core.model.Payment;
import tech.form3.payments.core.usecase.payments.getpayments.GetPayments;
import tech.form3.payments.core.usecase.payments.getpayments.PaymentsNotFoundException;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static tech.form3.payments.core.usecase.payments.PaymentUtils.NoAtrrPayment;

public class GetPaymentsUseCaseTest {

    GetPayments getAppPayments = mock(GetPayments.class);
    @Test
    public void GetAllPayments_noparams_resultallitems() throws Exception{
        givenPayments(null,null,null, null, null, NoAtrrPayment("id_1","org_1"), NoAtrrPayment("id_2","org_2"));
        List<Payment> payments = getAppPayments.getAllPayments(null,null,null,null,null);
        assertThat(payments, hasSize(2));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void GetAllPayments_null_NotFoundException() throws Exception{
        thrown.expect(PaymentsNotFoundException.class);
//Todo Add more tests to Not Found Exception
//        thrown.expectMessage(startsWith("some Message"));
//        thrown.expect(hasProperty("response", hasProperty("status", is(404))));
        throwPaymenstNotFoundException();
    }

    private void throwPaymenstNotFoundException(){
        throw new PaymentsNotFoundException();
    }

    private void givenPayments(Integer page, Integer limit, String sort, String selection, String eTag,Payment... payments ) {
        when(getAppPayments.getAllPayments(page, limit,sort,selection,eTag)).thenReturn(asList(payments));
    }



}
