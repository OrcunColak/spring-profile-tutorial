package com.colak.springprofiletutorial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("dev")
class DevProfileNameProviderTest {

    @Autowired
    private ProfileNameProvider profileNameProvider;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testGetActiveProfileName() {
        String result = profileNameProvider.getActiveProfileName();
        assertEquals("dev", result);
    }

    @Test
    void testGetMyValue() {
        String result = profileNameProvider.getMyValue();
        assertEquals("dev-application", result);
    }

    @Test
    void testMyComponent() {
        MyComponent myComponent = applicationContext.getBean(MyComponent.class);
        assertNotNull(myComponent);

    }
}
