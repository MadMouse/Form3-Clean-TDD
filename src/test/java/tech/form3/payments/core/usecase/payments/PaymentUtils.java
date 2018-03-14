package tech.form3.payments.core.usecase.payments;

import com.fasterxml.jackson.databind.ObjectMapper;
import tech.form3.payments.core.model.Payment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PaymentUtils {

    private static String PAYMENT_JSON = "{" +
            "\"type\": \"Payment\",\r\n" +
            "\"id\": \"4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43\",\r\n" +
            "\"version\": 0,\r\n" +
            "\"organisation_id\": \"743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb\",\r\n" +
            "\"attributes\": {\r\n  " +
            "\"amount\": \"100.21\",\r\n  " +
            "\"beneficiary_party\": " +
            "{\r\n    " +
            "\"account_name\": \"W Owens\",\r\n    " +
            "\"account_number\": \"31926819\",\r\n    " +
            "\"account_number_code\": \"BBAN\",\r\n    " +
            "\"account_type\": 0,\r\n    " +
            "\"address\": \"1 The Beneficiary Localtown SE2\",\r\n    " +
            "\"bank_id\": \"403000\",\r\n    " +
            "\"bank_id_code\": \"GBDSC\",\r\n    " +
            "\"name\": \"Wilfred Jeremiah Owens\"\r\n        " +
            "},\r\n  " +
            "\"charges_information\": {\r\n    " +
            "\"bearer_code\": \"SHAR\",\r\n    " +
            "\"sender_charges\": [\r\n            " +
            "{\r\n  \"amount\": \"5.00\",\r\n  " +
            "\"currency\": \"GBP\"\r\n            },\r\n            " +
            "{\r\n  " +
            "\"amount\": \"10.00\",\r\n  " +
            "\"currency\": \"USD\"\r\n            " +
            "}\r\n          ],\r\n    " +
            "\"receiver_charges_amount\": \"1.00\",\r\n    " +
            "\"receiver_charges_currency\": \"USD\"\r\n        " +
            "},\r\n  " +
            "\"currency\": \"GBP\",\r\n  " +
            "\"debtor_party\": " +
            "{\r\n    " +
            "\"account_name\": \"EJ Brown Black\",\r\n    " +
            "\"account_number\": \"GB29XABC10161234567801\",\r\n    " +
            "\"account_number_code\": \"IBAN\",\r\n    " +
            "\"address\": \"10 Debtor Crescent Sourcetown NE1\",\r\n    " +
            "\"bank_id\": \"203301\",\r\n    " +
            "\"bank_id_code\": \"GBDSC\",\r\n    " +
            "\"name\": \"Emelia Jane Brown\"\r\n        " +
            "},\r\n  " +
            "\"end_to_end_reference\": \"Wil piano Jan\",\r\n  " +
            "\"fx\": " +
            "{\r\n    " +
            "\"contract_reference\": \"FX123\",\r\n    " +
            "\"exchange_rate\": \"2.00000\",\r\n    " +
            "\"original_amount\": \"200.42\",\r\n    " +
            "\"original_currency\": \"USD\"\r\n        " +
            "},\r\n  " +
            "\"numeric_reference\": \"1002001\",\r\n  " +
            "\"payment_id\": \"123456789012345678\",\r\n  " +
            "\"payment_purpose\": \"Paying for goods services\",\r\n  " +
            "\"payment_scheme\": \"FPS\",\r\n  " +
            "\"payment_type\": \"Credit\",\r\n  " +
            "\"processing_date\": \"2017-01-18\",\r\n  " +
            "\"reference\": \"Payment for Em's piano lessons\",\r\n  " +
            "\"scheme_payment_sub_type\": \"InternetBanking\",\r\n  " +
            "\"scheme_payment_type\": \"ImmediatePayment\",\r\n  " +
            "\"sponsor_party\": " +
            "{\r\n    " +
            "\"account_number\": \"56781234\",\r\n    " +
            "\"bank_id\": \"123123\",\r\n    " +
            "\"bank_id_code\": \"GBDSC\"\r\n        " +
            "       }\r\n      " +
            "   }\r\n    " +
            "}";

    //Simple Payment Generator with out Attributes
    public static Payment NoAtrrPayment(String id, String Organization){
        Payment payment = new Payment("payment",id, 1, Organization, null);
        return payment;
    }

    //Create Single fully populated Model Payment Object
    public static Payment PopulatedDomainPayment() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Payment modelPayment = objectMapper.readValue(PAYMENT_JSON,Payment.class);
        return modelPayment;
    }

    //Create an array of Payments id is unique
    public static List<Payment> PopulatedDomainPayments(Integer iCount) throws IOException {
        List<Payment> payments = new ArrayList<Payment>();
        for(int i = 1; i <= iCount; i++){
            Payment payment =  PopulatedDomainPayment();
            payment.setId(payment.getId() + "_" + i);
            payments.add(payment);
        }
        return payments;
    }

    //Create Single fully populated Model Payment Object
    public static tech.form3.payments.dataproviders.network.model.Payment PopulatedNetworkPayment() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        tech.form3.payments.dataproviders.network.model.Payment networkPayment = objectMapper.readValue(PAYMENT_JSON,
                tech.form3.payments.dataproviders.network.model.Payment.class);
        return networkPayment;
    }


}
