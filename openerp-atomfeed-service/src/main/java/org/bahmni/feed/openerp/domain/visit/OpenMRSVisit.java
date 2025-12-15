package org.bahmni.feed.openerp.domain.visit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenMRSVisit {

    private String uuid;
    private List<Encounter> encounters = new ArrayList<>();
    private List<VisitAttributes> attributes = new ArrayList<>();

    public List<VisitAttributes> getAttributes() {
        return attributes;
    }

    public String getUuid() {
        return uuid;
    }

    public List<Encounter> getEncounters() {
        return encounters;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Encounter {
        private String uuid;
        private EncounterType encounterType;
        private List<org.bahmni.feed.openerp.domain.encounter.OpenMRSObservation> obs = new ArrayList<>();

        public String getUuid() {
            return uuid;
        }

        public EncounterType getEncounterType() {
            return encounterType;
        }

        public List<org.bahmni.feed.openerp.domain.encounter.OpenMRSObservation> getObs() {
            return obs;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EncounterType {
        private String uuid;
        private String display;

        public String getUuid() {
            return uuid;
        }

        public String getDisplay() {
            return display;
        }
    }
}
