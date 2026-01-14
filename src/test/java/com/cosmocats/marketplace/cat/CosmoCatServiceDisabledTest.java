package com.cosmocats.marketplace.cat;

import com.cosmocats.marketplace.feature.FeatureNotAvailableException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@TestPropertySource(properties = {
    "feature.cosmoCats.enabled=false"
})
})
class CosmoCatServiceDisabledTest {

    @Autowired
    private CosmoCatService cosmoCatService;

    @Test
    void shouldThrowExceptionWhenFeatureDisabled() {
        assertThrows(
                FeatureNotAvailableException.class,
                () -> cosmoCatService.getCosmoCats()
        );
    }
}
