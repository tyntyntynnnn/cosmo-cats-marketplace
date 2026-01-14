package com.cosmocats.marketplace.feature;

public class FeatureNotAvailableException extends RuntimeException {

    public FeatureNotAvailableException(String feature) {
        super("Feature is disabled: " + feature);
    }
}
