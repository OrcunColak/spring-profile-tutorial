package com.colak.springprofiletutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfileNameProviderTest {

    @Autowired
    ProfileNameProvider profileNameProvider;

    @Test
    void testGetActiveProfileName() {
        String result = profileNameProvider.getActiveProfileName();
        Assertions.assertEquals("local", result);
    }
}
