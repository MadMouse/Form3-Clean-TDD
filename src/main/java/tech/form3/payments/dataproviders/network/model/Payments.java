
package tech.form3.payments.dataproviders.network.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "links"
})
public class Payments {

    @JsonProperty("data")
    private List<Payment> data = null;
    @JsonProperty("links")
    private Links links;

    public Payments() {
    }

    public Payments(List<Payment> data, Links links) {
        this.data = data;
        this.links = links;
    }

    public List<Payment> getData() {
        return data;
    }

    public Links getLinks() {
        return links;
    }

    public void setData(List<Payment> data) {
        this.data = data;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
