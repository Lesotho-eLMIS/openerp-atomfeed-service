package org.bahmni.feed.openerp.domain.encounter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenMRSObservation {
    private String orderUuid;
    @JsonProperty("display") // OpenMRS REST payload provides the concept display under "display"
    private String conceptNameToDisplay;
    private Object value;
    private OpenMRSConcept concept;

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid;
    }

    public String getConceptNameToDisplay() {
        return conceptNameToDisplay;
    }

    public void setConceptNameToDisplay(String conceptNameToDisplay) {
        this.conceptNameToDisplay = conceptNameToDisplay;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public OpenMRSConcept getConcept() {
        return concept;
    }

    public void setConcept(OpenMRSConcept concept) {
        this.concept = concept;
    }
}
