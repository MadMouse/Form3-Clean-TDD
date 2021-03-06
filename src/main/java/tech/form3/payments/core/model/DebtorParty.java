
package tech.form3.payments.core.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "account_name",
    "account_number",
    "account_number_code",
    "address",
    "bank_id",
    "bank_id_code",
    "name"
})
public class DebtorParty {

    @JsonProperty("account_name")
    private String accountName;
    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("account_number_code")
    private String accountNumberCode;
    @JsonProperty("address")
    private String address;
    @JsonProperty("bank_id")
    private String bankId;
    @JsonProperty("bank_id_code")
    private String bankIdCode;
    @JsonProperty("name")
    private String name;

    public DebtorParty() {
    }

    public DebtorParty(String accountName, String accountNumber, String accountNumberCode, String address, String bankId, String bankIdCode, String name) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountNumberCode = accountNumberCode;
        this.address = address;
        this.bankId = bankId;
        this.bankIdCode = bankIdCode;
        this.name = name;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountNumberCode() {
        return accountNumberCode;
    }

    public String getAddress() {
        return address;
    }

    public String getBankId() {
        return bankId;
    }

    public String getBankIdCode() {
        return bankIdCode;
    }

    public String getName() {
        return name;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountNumberCode(String accountNumberCode) {
        this.accountNumberCode = accountNumberCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public void setBankIdCode(String bankIdCode) {
        this.bankIdCode = bankIdCode;
    }

    public void setName(String name) {
        this.name = name;
    }
}
