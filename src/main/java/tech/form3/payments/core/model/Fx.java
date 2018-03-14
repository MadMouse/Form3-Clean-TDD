
package tech.form3.payments.core.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contract_reference",
    "exchange_rate",
    "original_amount",
    "original_currency"
})
public class Fx {

    @JsonProperty("contract_reference")
    private String contractReference;
    @JsonProperty("exchange_rate")
    private String exchangeRate;
    @JsonProperty("original_amount")
    private String originalAmount;
    @JsonProperty("original_currency")
    private String originalCurrency;

    public Fx() {
    }

    public Fx(String contractReference, String exchangeRate, String originalAmount, String originalCurrency) {
        this.contractReference = contractReference;
        this.exchangeRate = exchangeRate;
        this.originalAmount = originalAmount;
        this.originalCurrency = originalCurrency;
    }

    public String getContractReference() {
        return contractReference;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public String getOriginalAmount() {
        return originalAmount;
    }

    public String getOriginalCurrency() {
        return originalCurrency;
    }

    public void setContractReference(String contractReference) {
        this.contractReference = contractReference;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
    }

    public void setOriginalCurrency(String originalCurrency) {
        this.originalCurrency = originalCurrency;
    }
}
