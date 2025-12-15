package org.bahmni.feed.openerp.domain.encounter;

import org.bahmni.openerp.web.request.builder.Parameter;

public class OpenMRSEncounterEvent {
    protected Parameter createParameter(String name, String value, String type) {
        // Avoid null values that can trigger NPEs during request building/parsing
        String safeValue = value != null ? value : "";
        return new Parameter(name, safeValue, type);
    }

    protected void validateUrls(String feedUri, String feedUrl) {
        if ((feedUrl != null && feedUrl.contains("$param")) || (feedUri != null && feedUri.contains("$param")))
            throw new RuntimeException("Junk values in the feedUrl:$param**");
    }
}
