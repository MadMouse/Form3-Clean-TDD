
package tech.form3.payments.core.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "account_number",
    "bank_id",
    "bank_id_code"
})
public class SponsorParty {

    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("bank_id")
    private String bankId;
    @JsonProperty("bank_id_code")
    private String bankIdCode;

    public SponsorParty() {
    }

    public SponsorParty(String accountNumber, String bankId, String bankIdCode) {
        this.accountNumber = accountNumber;
        this.bankId = bankId;
        this.bankIdCode = bankIdCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBankId() {
        return bankId;
    }

    public String getBankIdCode() {
        return bankIdCode;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public void setBankIdCode(String bankIdCode) {
        this.bankIdCode = bankIdCode;
    }
}
