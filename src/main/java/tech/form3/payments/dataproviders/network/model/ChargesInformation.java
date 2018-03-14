
package tech.form3.payments.dataproviders.network.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bearer_code",
    "sender_charges",
    "receiver_charges_amount",
    "receiver_charges_currency"
})
public class ChargesInformation {

    @JsonProperty("bearer_code")
    private String bearerCode;
    @JsonProperty("sender_charges")
    private List<SenderCharge> senderCharges = null;
    @JsonProperty("receiver_charges_amount")
    private String receiverChargesAmount;
    @JsonProperty("receiver_charges_currency")
    private String receiverChargesCurrency;

    public ChargesInformation() {
    }

    public ChargesInformation(String bearerCode, List<SenderCharge> senderCharges, String receiverChargesAmount, String receiverChargesCurrency) {
        this.bearerCode = bearerCode;
        this.senderCharges = senderCharges;
        this.receiverChargesAmount = receiverChargesAmount;
        this.receiverChargesCurrency = receiverChargesCurrency;
    }

    public String getBearerCode() {
        return bearerCode;
    }

    public List<SenderCharge> getSenderCharges() {
        return senderCharges;
    }

    public String getReceiverChargesAmount() {
        return receiverChargesAmount;
    }

    public String getReceiverChargesCurrency() {
        return receiverChargesCurrency;
    }

    public void setBearerCode(String bearerCode) {
        this.bearerCode = bearerCode;
    }

    public void setSenderCharges(List<SenderCharge> senderCharges) {
        this.senderCharges = senderCharges;
    }

    public void setReceiverChargesAmount(String receiverChargesAmount) {
        this.receiverChargesAmount = receiverChargesAmount;
    }

    public void setReceiverChargesCurrency(String receiverChargesCurrency) {
        this.receiverChargesCurrency = receiverChargesCurrency;
    }
}
