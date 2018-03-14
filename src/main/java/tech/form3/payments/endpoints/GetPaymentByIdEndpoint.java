package tech.form3.payments.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.form3.payments.core.model.Payment;
import tech.form3.payments.core.usecase.payments.getpayment.PaymentNotFoundException;
import tech.form3.payments.core.usecase.payments.getpayment.impl.GetPaymentByIdImpl;
import tech.form3.payments.dataproviders.network.converters.NetworkModelConverter;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GetPaymentByIdEndpoint {

    public static final String API_PATH = "/payment/{resourceid}/";

    private static final Logger LOGGER = LoggerFactory.getLogger(GetPaymentByIdEndpoint.class);

    private GetPaymentByIdImpl getPaymentByIdImpl;

    public GetPaymentByIdEndpoint(GetPaymentByIdImpl getPaymentByIdImpl) {
        this.getPaymentByIdImpl = getPaymentByIdImpl;
    }

    @RequestMapping(value = API_PATH, method = GET)
    public tech.form3.payments.dataproviders.network.model.Payment getPayment(@PathVariable String resourceid) {
        LOGGER.info("Retrieving payment for resource : {}", resourceid);
        try {
            Payment payment = getPaymentByIdImpl.getPaymentById(resourceid);
            return  convertToDto(payment);
        } catch (PaymentNotFoundException e) {
            LOGGER.info("payment not found: {}", resourceid);
            throw new NotFoundException();
        }
    }


    private tech.form3.payments.dataproviders.network.model.Payment convertToDto(Payment payment) {
        return NetworkModelConverter.convertDomainPaymentToNetworkPayment(payment);
    }

}
