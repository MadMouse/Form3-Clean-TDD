package tech.form3.payments.dataproviders.network.converters;


import org.modelmapper.ModelMapper;
import tech.form3.payments.core.model.Payment;

public class NetworkModelConverter {


    public static Payment convertNetworkPaymentToDomainPayment(tech.form3.payments.dataproviders.network.model.Payment networkPayment){
        ModelMapper modelMapper = new ModelMapper();
        Payment modelPayment = modelMapper.map(networkPayment, Payment.class);
        return modelPayment;

    }

    public static tech.form3.payments.dataproviders.network.model.Payment convertDomainPaymentToNetworkPayment(Payment domainPayment){
        ModelMapper modelMapper = new ModelMapper();
        tech.form3.payments.dataproviders.network.model.Payment networkPayment =
                                modelMapper.map(domainPayment, tech.form3.payments.dataproviders.network.model.Payment.class);
        return networkPayment;

    }

}
