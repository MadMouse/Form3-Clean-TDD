
package tech.form3.payments.core.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "beneficiary_party",
    "charges_information",
    "currency",
    "debtor_party",
    "end_to_end_reference",
    "fx",
    "numeric_reference",
    "payment_id",
    "payment_purpose",
    "payment_scheme",
    "payment_type",
    "processing_date",
    "reference",
    "scheme_payment_sub_type",
    "scheme_payment_type",
    "sponsor_party"
})
public class Attributes {

    @JsonProperty("amount")
    private String amount;
    @JsonProperty("beneficiary_party")
    private BeneficiaryParty beneficiaryParty;
    @JsonProperty("charges_information")
    private ChargesInformation chargesInformation;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("debtor_party")
    private DebtorParty debtorParty;
    @JsonProperty("end_to_end_reference")
    private String endToEndReference;
    @JsonProperty("fx")
    private Fx fx;
    @JsonProperty("numeric_reference")
    private String numericReference;
    @JsonProperty("payment_id")
    private String paymentId;
    @JsonProperty("payment_purpose")
    private String paymentPurpose;
    @JsonProperty("payment_scheme")
    private String paymentScheme;
    @JsonProperty("payment_type")
    private String paymentType;
    @JsonProperty("processing_date")
    private String processingDate;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("scheme_payment_sub_type")
    private String schemePaymentSubType;
    @JsonProperty("scheme_payment_type")
    private String schemePaymentType;
    @JsonProperty("sponsor_party")
    private SponsorParty sponsorParty;

    public Attributes() {
    }

    public Attributes(String amount, BeneficiaryParty beneficiaryParty, ChargesInformation chargesInformation, String currency, DebtorParty debtorParty, String endToEndReference, Fx fx, String numericReference, String paymentId, String paymentPurpose, String paymentScheme, String paymentType, String processingDate, String reference, String schemePaymentSubType, String schemePaymentType, SponsorParty sponsorParty) {
        this.amount = amount;
        this.beneficiaryParty = beneficiaryParty;
        this.chargesInformation = chargesInformation;
        this.currency = currency;
        this.debtorParty = debtorParty;
        this.endToEndReference = endToEndReference;
        this.fx = fx;
        this.numericReference = numericReference;
        this.paymentId = paymentId;
        this.paymentPurpose = paymentPurpose;
        this.paymentScheme = paymentScheme;
        this.paymentType = paymentType;
        this.processingDate = processingDate;
        this.reference = reference;
        this.schemePaymentSubType = schemePaymentSubType;
        this.schemePaymentType = schemePaymentType;
        this.sponsorParty = sponsorParty;
    }

    public String getAmount() {
        return amount;
    }

    public BeneficiaryParty getBeneficiaryParty() {
        return beneficiaryParty;
    }

    public ChargesInformation getChargesInformation() {
        return chargesInformation;
    }

    public String getCurrency() {
        return currency;
    }

    public DebtorParty getDebtorParty() {
        return debtorParty;
    }

    public String getEndToEndReference() {
        return endToEndReference;
    }

    public Fx getFx() {
        return fx;
    }

    public String getNumericReference() {
        return numericReference;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getPaymentPurpose() {
        return paymentPurpose;
    }

    public String getPaymentScheme() {
        return paymentScheme;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getProcessingDate() {
        return processingDate;
    }

    public String getReference() {
        return reference;
    }

    public String getSchemePaymentSubType() {
        return schemePaymentSubType;
    }

    public String getSchemePaymentType() {
        return schemePaymentType;
    }

    public SponsorParty getSponsorParty() {
        return sponsorParty;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setBeneficiaryParty(BeneficiaryParty beneficiaryParty) {
        this.beneficiaryParty = beneficiaryParty;
    }

    public void setChargesInformation(ChargesInformation chargesInformation) {
        this.chargesInformation = chargesInformation;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setDebtorParty(DebtorParty debtorParty) {
        this.debtorParty = debtorParty;
    }

    public void setEndToEndReference(String endToEndReference) {
        this.endToEndReference = endToEndReference;
    }

    public void setFx(Fx fx) {
        this.fx = fx;
    }

    public void setNumericReference(String numericReference) {
        this.numericReference = numericReference;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentPurpose(String paymentPurpose) {
        this.paymentPurpose = paymentPurpose;
    }

    public void setPaymentScheme(String paymentScheme) {
        this.paymentScheme = paymentScheme;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setProcessingDate(String processingDate) {
        this.processingDate = processingDate;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setSchemePaymentSubType(String schemePaymentSubType) {
        this.schemePaymentSubType = schemePaymentSubType;
    }

    public void setSchemePaymentType(String schemePaymentType) {
        this.schemePaymentType = schemePaymentType;
    }

    public void setSponsorParty(SponsorParty sponsorParty) {
        this.sponsorParty = sponsorParty;
    }
}
