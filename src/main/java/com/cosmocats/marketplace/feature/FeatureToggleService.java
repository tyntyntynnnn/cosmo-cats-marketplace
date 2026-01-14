package com.cosmocats.marketplace.feature;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class FeatureToggleService {

    private final Map<String, Boolean> featureFlags;

    public FeatureToggleService(
            @Value("#{${feature.flags:{}}}") Map<String, Boolean> featureFlags
    ) {
        this.featureFlags = featureFlags;
    }

    public boolean isEnabled(String featureName) {
        return featureFlags.getOrDefault(featureName, false);
    }
}
