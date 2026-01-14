package com.cosmocats.marketplace.cat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(properties = {
        "feature.cosmoCats.enabled=true"
})
class CosmoCatServiceTest {

    @Autowired
    private CosmoCatService cosmoCatService;

    @Test
    void shouldReturnCatsWhenFeatureEnabled() {
        var cats = cosmoCatService.getCosmoCats();
        assertEquals(3, cats.size());
    }
}
