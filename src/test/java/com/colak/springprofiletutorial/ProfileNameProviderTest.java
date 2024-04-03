package com.colak.springprofiletutorial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProfileNameProviderTest {

    @Autowired
    private ProfileNameProvider profileNameProvider;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testGetActiveProfileName() {
        String result = profileNameProvider.getActiveProfileName();
        assertEquals("default,dev", result);
    }

    @Test
    void testGetMyValue() {
        String result = profileNameProvider.getMyValue();
        assertEquals("dev-application", result);
    }

    @Test
    void getMyInheritedValue() {
        String result = profileNameProvider.getMyInheritedValue();
        assertEquals("inherited-message", result);
    }

    @Test
    void testMyComponent() {
        assertDoesNotThrow(() -> applicationContext.getBean(MyComponent.class));
    }
}
