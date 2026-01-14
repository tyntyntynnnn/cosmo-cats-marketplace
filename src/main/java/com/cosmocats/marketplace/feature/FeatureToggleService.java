package com.cosmocats.marketplace.feature;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeatureToggleService {

    private final FeatureProperties featureProperties;

    public boolean isEnabled(String featureName) {
        if ("cosmoCats".equals(featureName)) {
            return featureProperties.getCosmoCats().isEnabled();
        }
        return false;
    }
}
