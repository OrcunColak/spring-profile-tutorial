package com.colak.springprofiletutorial;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class SpringProfileTutorialApplication implements CommandLineRunner {

    private final ProfileNameProvider profileNameProvider;

    public static void main(String[] args) {
        SpringApplication.run(SpringProfileTutorialApplication.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("Active profiles are : {}", profileNameProvider.getActiveProfileName());
    }
}
