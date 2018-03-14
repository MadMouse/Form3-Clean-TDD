package tech.form3.payments.core.usecase.payments.addpayment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.mockito.Mockito.mock;

public class AddPaymentUserCaseTest {
    AddPayment addPayments = mock(AddPayment.class);

    @Rule
    public ExpectedException thrownInsertFailedException = ExpectedException.none();

    @Test
    public void AddPayment_null_InsertFailedException() throws Exception{
        thrownInsertFailedException.expect(PaymentInsertFailedException.class);
//Todo Add more tests to Not Found Exception
//        thrown.expectMessage(startsWith("some Message"));
//        thrown.expect(hasProperty("response", hasProperty("status", is(404))));
        throwPaymentinsertFailedException();
    }

    private void throwPaymentinsertFailedException(){
        throw new PaymentInsertFailedException();
    }

}
