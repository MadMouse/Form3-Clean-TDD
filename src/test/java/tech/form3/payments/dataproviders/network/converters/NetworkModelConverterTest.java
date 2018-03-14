package tech.form3.payments.dataproviders.network.converters;

import org.junit.Test;
import tech.form3.payments.core.model.Payment;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static tech.form3.payments.core.usecase.payments.PaymentUtils.PopulatedDomainPayment;
import static tech.form3.payments.core.usecase.payments.PaymentUtils.PopulatedNetworkPayment;

public class NetworkModelConverterTest {

    @Test
    public void Converter_FromDomain_ToNetwork() throws IOException {

        Payment domainPayment = PopulatedDomainPayment();

        tech.form3.payments.dataproviders.network.model.Payment networkPayment =
                NetworkModelConverter.convertDomainPaymentToNetworkPayment(domainPayment);

        //todo Convert to matcher to compare the objects correctly.
        assertThat(domainPayment.getId(), is(networkPayment.getId()));
    }


    @Test
    public void Converter_FromNetwork_ToDomain() throws IOException {

        tech.form3.payments.dataproviders.network.model.Payment networkPayment = PopulatedNetworkPayment();

        Payment domainPayment = NetworkModelConverter.convertNetworkPaymentToDomainPayment(networkPayment);

        //todo Convert to matcher to compare the objects correctly.
        assertThat(domainPayment.getId(), is(networkPayment.getId()));


    }

}
