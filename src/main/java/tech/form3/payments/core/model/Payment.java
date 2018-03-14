
package tech.form3.payments.core.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "version",
    "organisation_id",
    "attributes"
})
public class Payment {

    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("organisation_id")
    private String organisationId;
    @JsonProperty("attributes")
    private Attributes attributes;

    public Payment(){}
    public Payment(String type, String id, Integer version, String organisationId, Attributes attributes) {
        this.type = type;
        this.id = id;
        this.version = version;
        this.organisationId = organisationId;
        this.attributes = attributes;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public String getOrganisationId() {
        return organisationId;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setOrganisationId(String organisationId) {
        this.organisationId = organisationId;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}
