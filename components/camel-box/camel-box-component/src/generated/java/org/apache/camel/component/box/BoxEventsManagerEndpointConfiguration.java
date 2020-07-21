
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.box.api.BoxEventsManager
 */
@UriParams
@Configurer
public final class BoxEventsManagerEndpointConfiguration extends BoxConfiguration {

    @UriParam
    private Long startingPosition;

    public Long getStartingPosition() {
        return startingPosition;
    }

    public void setStartingPosition(Long startingPosition) {
        this.startingPosition = startingPosition;
    }
}