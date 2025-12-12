package org.bahmni.feed.openerp.domain.encounter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import liquibase.pro.packaged.du;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenMRSDrugOrder {

  private OpenMRSConcept concept;
  private String drugNonCoded;
  private OpenMRSDrug drug;
  private DosingInstructions dosingInstructions;
  private String action;
  private String uuid;
  private String previousOrderUuid;
  private String orderType;
  private Date dateActivated;
  private boolean voided;
  private String encounterUuid;
  private OpenMRSVisit visit;
  private Provider provider;
  // New Field
  private String duration;
  private String durationUnits;

  public OpenMRSConcept getConcept() {
    return concept;
  }

  public String getConceptName() {
    return getConcept() != null ? getConcept().getName() : null;
  }

  public String getConceptClass() {
    return getConcept() != null ? getConcept().getConceptClass() : null;
  }

  public String getDrugNonCoded() {
    return drugNonCoded;
  }

  public String getDuration() {
    return duration;
  }

  public String getDurationUnits() {
    return durationUnits;
  }

  public OpenMRSDrug getDrug() {
    return drug;
  }

  public DosingInstructions getDosingInstructions() {
    return dosingInstructions;
  }

  public String getAction() {
    return action;
  }

  public Date getDateActivated() {
    return dateActivated;
  }

  public String getUuid() {
    return uuid;
  }

  public String getPreviousOrderUuid() {
    return previousOrderUuid;
  }

  public String getDrugUuid() {
    return getDrug() != null ? getDrug().getUuid() : null;
  }

  public String getDrugName() {
    return getDrug() != null ? getDrug().getName() : null;
  }

  public Double getQuantity() {
    return getDosingInstructions() != null
      ? getDosingInstructions().getQuantity()
      : null;
  }

  public String getQuantityUnits() {
    return getDosingInstructions() != null
      ? getDosingInstructions().getQuantityUnits()
      : null;
  }

  public String getEncounterUuid() {
    return encounterUuid;
  }

  public String getVisitUuid() {
    return getVisit().getUuid();
  }

  public OpenMRSVisit getVisit() {
    return visit;
  }

  public boolean isVoided() {
    return voided;
  }

  public String getOrderType() {
    return orderType;
  }

  public String getProviderName() {
    return getProvider().getName();
  }

  public Provider getProvider() {
    return provider;
  }

  public String getDosage() {
    return getDosingInstructions() != null
      ? getDosingInstructions().getDose()
      : null;
  }

  public String getDosageUnits() {
    return getDosingInstructions() != null
      ? getDosingInstructions().getDoseUnits()
      : null;
  }

  public String getFrequency() {
    return getDosingInstructions() != null
      ? getDosingInstructions().getFrequency()
      : null;
  }

  public String getRoute() {
    return getDosingInstructions() != null
      ? getDosingInstructions().getRoute()
      : null;
  }

  public String getDosingInstructionsText() {
    return getDosingInstructions() != null
      ? getDosingInstructions().getInstructions()
      : null;
  }

  public String getAdministrationInstructions() {
    return getDosingInstructions() != null
      ? getDosingInstructions().getAdministrationInstruction()
      : null;
  }

  public Integer getNumberOfRefills() {
    return getDosingInstructions() != null
      ? getDosingInstructions().getNumRefills()
      : null;
  }

  public String getAsNeeded() {
    return getDosingInstructions() != null
      ? getDosingInstructions().getAsNeeded()
      : null;
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public class OpenMRSDrug {

    private String uuid;
    private String name;
    private String form;

    public String getUuid() {
      return uuid;
    }

    public String getName() {
      return name;
    }

    public String getForm() {
      return form;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public class DosingInstructions {

    private Double quantity;
    private String quantityUnits;
    // new fields
    private String dose;
    private String frequency;
    private String instructions;
    private String doseUnits;
    private String route;
    private String administrationInstruction;
    private Integer numRefills;
    private String asNeeded;

    public Double getQuantity() {
      return quantity;
    }

    // Add getters for new fields
    public String getDose() {
      return dose;
    }

    public String getRoute() {
      return route;
    }

    public String getFrequency() {
      return frequency;
    }

    public String getInstructions() {
      return instructions;
    }

    public String getAdministrationInstruction() {
      return administrationInstruction;
    }

    public Integer getNumRefills() {
      return numRefills;
    }

    public String getAsNeeded() {
      return asNeeded;
    }

    public String getDoseUnits() {
      return doseUnits;
    }

    public String getQuantityUnits() {
      return quantityUnits;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public class OpenMRSVisit {

    private String uuid;

    public String getUuid() {
      return uuid;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public class Provider {

    private String name;

    public String getName() {
      return name;
    }
  }
}
