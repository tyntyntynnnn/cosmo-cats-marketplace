package com.cosmocats.marketplace.feature;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class FeatureToggleAspect {

    private final FeatureToggleService featureToggleService;

    @Around("@annotation(featureToggle)")
    public Object checkFeature(
            ProceedingJoinPoint joinPoint,
            FeatureToggle featureToggle
    ) throws Throwable {

        String featureName = featureToggle.value();

        if (!featureToggleService.isEnabled(featureName)) {
            throw new FeatureNotAvailableException(featureName);
        }

        return joinPoint.proceed();
    }
}
