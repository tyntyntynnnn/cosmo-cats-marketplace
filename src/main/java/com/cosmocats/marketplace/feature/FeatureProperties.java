package com.cosmocats.marketplace.feature;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "feature")
@Getter
@Setter
public class FeatureProperties {

    private CosmoCats cosmoCats = new CosmoCats();

    @Getter
    @Setter
    public static class CosmoCats {
        private boolean enabled;
    }
}
