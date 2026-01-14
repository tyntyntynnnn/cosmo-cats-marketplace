package com.cosmocats.marketplace.cat;

import com.cosmocats.marketplace.feature.FeatureToggle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CosmoCatService {

    @FeatureToggle("cosmoCats")
    public List<String> getCosmoCats() {
        return List.of("Luna", "Nebula", "Orion");
    }
}
