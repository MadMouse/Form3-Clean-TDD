package tech.form3.payments.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.form3.payments.core.model.Payment;
import tech.form3.payments.core.usecase.payments.getpayment.PaymentNotFoundException;
import tech.form3.payments.core.usecase.payments.getpayment.impl.GetPaymentByIdImpl;
import tech.form3.payments.core.usecase.payments.getpayments.GetPayments;
import tech.form3.payments.core.usecase.payments.getpayments.PaymentsNotFoundException;
import tech.form3.payments.core.usecase.payments.getpayments.impl.GetPaymentsImpl;
import tech.form3.payments.dataproviders.network.converters.NetworkModelConverter;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GetPaymentsEndpoint {

    public static final String API_PATH = "/payment/";

    private static final Logger LOGGER = LoggerFactory.getLogger(GetPaymentsEndpoint.class);

    private GetPaymentsImpl getPaymentsImpl;

    public GetPaymentsEndpoint(GetPaymentsImpl getPaymentsImpl) {
        this.getPaymentsImpl = getPaymentsImpl;
    }

    @RequestMapping(value = API_PATH, method = GET)
    public List<tech.form3.payments.dataproviders.network.model.Payment> getPayments(@RequestParam Integer page,
                                                                               @RequestParam Integer limit,
                                                                               @RequestParam String sort,
                                                                               @RequestParam String selection,
                                                                               @RequestParam String eTag) {
        LOGGER.info("Retrieving all payments");
        try {
            List<Payment> payments = getPaymentsImpl.getAllPayments(page, limit, sort, selection, eTag);
            return  convertToDto(payments);
        } catch (PaymentsNotFoundException e) {
            LOGGER.info("payments not found: {}");
            throw new NotFoundException();
        }
    }


    private List<tech.form3.payments.dataproviders.network.model.Payment> convertToDto(List<Payment> payments) {

        return new ArrayList<tech.form3.payments.dataproviders.network.model.Payment>();
 //       return NetworkModelConverter.convertDomainPaymentToNetworkPayment(payment);
    }

}
