package com.colak.springprofiletutorial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class ProfileNameProviderTest {

    @Autowired
    private ProfileNameProvider profileNameProvider;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testGetActiveProfileName() {
        String result = profileNameProvider.getActiveProfileName();
        assertEquals("local", result);
    }

    @Test
    void testGetMyValue() {
        String result = profileNameProvider.getMyValue();
        assertEquals("application", result);
    }

    @Test
    void testMyComponent() {
        assertThrows(NoSuchBeanDefinitionException.class,
                () -> applicationContext.getBean(MyComponent.class)
        );
    }
}
