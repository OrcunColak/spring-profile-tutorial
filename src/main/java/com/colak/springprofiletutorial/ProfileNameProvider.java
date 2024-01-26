package com.colak.springprofiletutorial;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProfileNameProvider {

    private final Environment environment;

    @Value("${my-value}")
    String myValue;

    public String getActiveProfileName() {
        String[] activeProfiles = environment.getActiveProfiles();
        if (activeProfiles.length > 0) {
            return activeProfiles[0];
        }
        return "No active profile found";
    }

    public String getMyValue() {
        return myValue;
    }
}
