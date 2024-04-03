package com.colak.springprofiletutorial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@ActiveProfiles("test")
class TestProfileNameProviderTest {

    @Autowired
    private ProfileNameProvider profileNameProvider;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testGetActiveProfileName() {
        String result = profileNameProvider.getActiveProfileName();
        assertEquals("default,test", result);
    }

    @Test
    void testGetMyValue() {
        String result = profileNameProvider.getMyValue();
        assertEquals("test-application", result);
    }

    @Test
    void getMyInheritedValue() {
        String result = profileNameProvider.getMyInheritedValue();
        assertEquals("inherited-message", result);
    }

    @Test
    void testMyComponent() {
        assertThrows(NoSuchBeanDefinitionException.class,
                () -> applicationContext.getBean(MyComponent.class)
        );

    }
}
