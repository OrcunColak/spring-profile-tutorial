package com.colak.springprofiletutorial;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProfileNameProvider {

    private final Environment environment;

    @Getter
    @Value("${my-value}")
    String myValue;

    public String getActiveProfileName() {
        return String.join(",", environment.getActiveProfiles());
    }
}
